package org.alpha.akash.constructor;

public class Parent {


    String empName ="ABC";
    public Parent() {
        System.out.println("I am inside of Parent class");
    }

    public Parent(String name) {
        System.out.println("My Name Is:-" +name);
    }
    private Parent(char ch) {
        System.out.println(ch);
    }
    protected Parent(boolean ch) {
        System.out.println(ch);}
    Parent(Float f) {
        System.out.println(f);

    }

    public Parent (long l) {
        System.out.println(l);
    }

//    public static void main(String[] args) {
//        Parent obj = new Parent('A');


//    }



}
