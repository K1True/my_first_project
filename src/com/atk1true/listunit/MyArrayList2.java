package com.atk1true.listunit;

import java.util.Arrays;

public class MyArrayList2<E> implements MyList<E>{
    Object[] obj = new Object[10];
    int size;
    @Override
    public boolean add(E e) {
        obj[size] = e;
        size++;
        return true;
    }
    public E get(int index){
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return "MyArrayList2{" +
                "obj=" + Arrays.toString(obj) +
                '}';
    }
}
