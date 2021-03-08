package com.ruiz211.TheJavaLibrary.I.StringHandling;

public class SpecialStringOperations {
    public static void main(String... doYourBest) {
        //String Concatenation
        String name = "John";
        int age = 37;
        String greet = "Hi! " + name + ", you are " + age + " years old";
        System.out.println(greet);

        //String Conversion and toString( )
        Person person = new Person(name, age);
        System.out.println(person);
    }
}

class Person {
    private String name;
    private int age;

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
}