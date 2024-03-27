package com.atk1true.file;

import java.io.*;

public class Person implements Serializable {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    private static void method01() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/k1true/IdeaProjects/mac_test_project/testdir/test2/1.txt"));
        Person kyz = new Person("kyz", 32);
        oos.writeObject(kyz);
        oos.close();
    }
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/k1true/IdeaProjects/mac_test_project/testdir/test2/1.txt"));
        Person person = (Person) ois.readObject();
        System.out.println("person = " + person);
        ois.close();
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        method01();
        read();
    }
}
