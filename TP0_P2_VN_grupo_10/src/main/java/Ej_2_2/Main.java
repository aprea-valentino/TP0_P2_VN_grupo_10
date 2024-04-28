package Ej_2_2;

import Ej_2_2.model.*;


public class Main {
    public static void main(String[] args) {
        IStack<Object> stackGen = new StackGenerico<>();

        stackGen.add(10);
        stackGen.add("a");
        stackGen.add("b");
        stackGen.add(210);

        IQueve<Object> queve = new QueveGenerico<>();

        queve.add("a");
        queve.add("b");
        queve.add("c");
        queve.add("d");


        IPriorityQueve<Object> priorityQueve = new PriorityQueveGenerico<>();

        priorityQueve.add(1,2);
        priorityQueve.add("a",2);
        priorityQueve.add(2,1);

        ISet<Object> set = new Set<>();

        set.add(1);
        set.add(2);
        System.out.println(set.choose());




    }
}

