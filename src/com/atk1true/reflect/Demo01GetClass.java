package com.atk1true.reflect;

import org.junit.jupiter.api.Test;

public class Demo01GetClass {
    @Test
    public void get1() throws ClassNotFoundException {
        Person person = new Person();
        Class<? extends Person> aClass1 = person.getClass();
        System.out.println("aClass1 = " + aClass1);
        Class<Person> aClass2 = Person.class;
        System.out.println("aClass2 = " + aClass2);
        Class<?> aClass3 = Class.forName("com.atk1true.reflect.Person");
        System.out.println("aClass3 = " + aClass3);
        System.out.println(aClass1==aClass2);
        System.out.println(aClass1==aClass3);
    }
    
}
