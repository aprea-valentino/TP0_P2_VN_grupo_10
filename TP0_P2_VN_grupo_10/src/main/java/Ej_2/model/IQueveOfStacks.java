package Ej_2.model;

public interface IQueveOfStacks {


    void add(IStack stack);

    void remove();

    IStack getFirtsRow();

    int getSize();

    boolean isEmpty();

}
