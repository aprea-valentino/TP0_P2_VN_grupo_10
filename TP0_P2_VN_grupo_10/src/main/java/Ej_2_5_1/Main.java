package Ej_2_5_1;



import java.util.Random;


import Ej_2_5_1.utils.StackUtil;
import Ej_2_5_1.model.*;



public class Main {
    public static void main(String[] args) {

        IStack<Object> stack = new StackGenerico<>();
        for (int i = 0; i < 10000; i++) {
            int a = new Random().nextInt(100000);
            stack.add(a);
        }
        StackUtil.print(stack);

        IStack<Object> stackOrdNoRep = StackUtil.stackOrd_NoRepe(stack);
        StackUtil.print(stackOrdNoRep);
    }
}
