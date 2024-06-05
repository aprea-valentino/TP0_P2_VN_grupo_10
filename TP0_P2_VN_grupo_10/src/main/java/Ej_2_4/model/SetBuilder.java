package Ej_2_4.model;

import java.util.HashSet;

public class SetBuilder<T> implements Builder<T>{
    private Set<T> set;

    public SetBuilder(){
        this.set = new Set<>();
    }

    @Override
    public void add(T element) {
        set.add(element);
    }
}
