package com.atk1true.listunit;

import javax.lang.model.element.Element;
import java.util.ArrayList;

public class ListUtils {
    public static <E> void addAll(ArrayList<E> list,E...e){
        for(E element : e){
            list.add(element);
        }
    }
}
