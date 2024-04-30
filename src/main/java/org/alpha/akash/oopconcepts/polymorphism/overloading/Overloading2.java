package org.alpha.akash.oopconcepts.polymorphism.overloading;

public class Overloading2 {

    public void getData(int age , String name ) {
        System.out.println("I am age and String Mehtod");
        System.out.println(age + name );
    }

    public void getData (String name , int age) {
        System.out.println("I am String and age Mehtod");
        System.out.println(name + age);
    }

    public static void main(String[] args) {
        new Overloading2().getData(100, "Vaishnavi");

        Overloading2 obj = new Overloading2();
        obj.getData(24, "Akash");
        obj.getData("Akash" , 24);
    }
}
