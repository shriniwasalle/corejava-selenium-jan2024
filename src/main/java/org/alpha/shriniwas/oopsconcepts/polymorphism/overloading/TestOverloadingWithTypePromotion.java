package org.alpha.shriniwas.oopsconcepts.polymorphism.overloading;

public class TestOverloadingWithTypePromotion {

//    public void m1(char ch) {
//        System.out.println(ch);
//    }

//    public void m1(int age) {
//        System.out.println(age);
//    }

    public void m1(long f) {
        System.out.println("Float " +f);
    }

    public void m1(int age) {
        System.out.println("Age: "+age);
    }

    public void m1(String str) {
        System.out.println(str);
    }

    public void getData(int age, char ch) {
        System.out.println("Inside int , char");
    }

    public void getData(char ch, int age) {
        System.out.println("Inside char, int");
    }

    public static void main(String[] args) {
        TestOverloadingWithTypePromotion obj = new TestOverloadingWithTypePromotion();
        // obj.m1('z'); // Type Promotion : char -> int
        // obj.m1(100); // No promotion
        obj.m1(105);

        // obj.getData('A', 'B'); // Compilation Error: Ambiguous method call
    }
}
