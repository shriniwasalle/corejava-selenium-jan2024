package org.alpha.sanjeevani.onlycorejavaconcepts.oopsconcepts.polymorphism.overloading;

public class TestOverLoading2 {
    public void getData(String str,int age){
        System.out.println("I am in String ,int method ");
        System.out.println(str);
        System.out.println(age);
    }
    public void getData(int age,String str){
        System.out.println("I am in int,String method ");
        System.out.println(age);
        System.out.println(str);

    }
    public static void main(String[] args) {
        new TestOverLoading2().getData("vedant",6);
        new TestOverLoading2().getData(4,"shlok");

    }
}
