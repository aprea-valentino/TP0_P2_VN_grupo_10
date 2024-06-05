package Ej_2_4.model;

import Ej_2_4.model.*;
public class Director {
    Builder<Object> builder;

    public Director(Builder<Object> builder) {
        this.builder = builder;
    }

    public void constructStructure(Object[] elements) {
        for (Object element : elements) {
            builder.add(element);
        }
    }


}