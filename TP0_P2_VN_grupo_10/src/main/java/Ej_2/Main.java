package Ej_2;

import java.util.Scanner;

import Ej_2.model.*;

public class Main {
    public static void main(String[] args) {

        IQueveOfStacks queveOfStacks = new QueveOfStack();

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese numero de filas de la matriz");

        int n = Integer.parseInt(myObj.nextLine());  // Read user input

        for (int i = 0; i < n; i++) {
            IStack stack = new Stack();
            for (int j = 0; j < n; j++) {
                int x = (int) gen_random(10, 1);
                System.out.print(x);
                stack.add(x);
            }
            System.out.println(" ");
            queveOfStacks.add(stack);
        }



        int res = traza(queveOfStacks);


        System.out.println("La traza de la matriz es: " + res);


    }

    public static long gen_random(int max, int min){
        double random = (Math.random() * (max-min) + min);
        long n = (long) Math.floor(random);
        return n;
    }

    public static int traza(IQueveOfStacks queveOfStacks){
        int n = 0;
        int res = 0;
        while(!queveOfStacks.isEmpty()){
            IStack stack = queveOfStacks.getFirtsRow();

            for(int i = 0; i < n; i++){
                stack.remove();
            }
            res += stack.getTop();
            queveOfStacks.remove();
            n++;
        }

        return res;

    }

}