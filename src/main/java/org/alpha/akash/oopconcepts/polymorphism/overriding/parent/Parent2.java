package org.alpha.akash.oopconcepts.polymorphism.overriding.parent;

public class Parent2 {
    public void m1(){
        System.out.println("Inside Parent2 :: m1 method");
    }

    public void m2(String str){
        System.out.println("Inside Parent2 :: m2 method" + str);
    }

    public void m3(int age, String name){
        System.out.println("Inside Parent2 :: m3 method" + age + name);
    }

    public void m4(){
        System.out.println("Inside Parent2 :: m4 method");
    }
}
