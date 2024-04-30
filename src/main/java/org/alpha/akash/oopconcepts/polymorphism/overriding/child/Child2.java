package org.alpha.akash.oopconcepts.polymorphism.overriding.child;

import org.alpha.akash.oopconcepts.polymorphism.overriding.parent.Parent2;

public class Child2 extends Parent2 {

    public void m1(){
        System.out.println("Inside Child2 :: m1 method");
    }

    public void m2(String name){
        System.out.println("Inside Child2 :: m2 method" + name);
    }

    public void m3(String name, int age){
        System.out.println("Inside Child2 :: m3 method" + name + age);
    }

    public void m4(int age, String name){
        System.out.println("Inside Child2 :: 4 method" + age + name);
    }

    public static void main(String[] args) {

        Child2 obj = new Child2();
        obj.m1(); //Child :: m1()
       // obj.m2("Akash"); //Child :: m2()
        obj.m3("Akash",24); //Child :: m3()
        obj.m3(24,"Akash"); //parent2 :: m3()
        obj.m4(); //parent2 :: m4()

        Parent2 obj1 = new Child2();
        obj1.m1(); //Child :: m1()
        obj1.m2("Akash"); //Child :: m2()
        obj1.m3(24,"Akki"); //parent2 :: m3()
        obj1.m4(); //parent2 :: m4()

        Parent2 obj2 = new Parent2();
        obj2.m4(); //parent2 :: m4()
        obj2.m3(20,"Ram"); //parent2 :: m3()
        obj2.m2("Sham"); //parent2 :: m2()
        obj2.m1();//parent2 :: m1()

    }
}
