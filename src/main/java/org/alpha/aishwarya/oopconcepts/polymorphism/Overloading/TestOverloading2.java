package org.alpha.aishwarya.oopconcepts.polymorphism.Overloading;

public class TestOverloading2 {
    public void getData(String str , int age){
        System.out.println("I am in String , int method");
        System.out.println(age);
        System.out.println(str);
    }

    public void getData(int age , String str){
        System.out.println("I am in int, String method");
        System.out.println(age);
        System.out.println(str);
    }

    public static void main(String[] args) {
        TestOverloading2 obj = new TestOverloading2();
        obj.getData(10, "Aishwarya");
        obj.getData("Aishwarya1", 20);
    }
}
