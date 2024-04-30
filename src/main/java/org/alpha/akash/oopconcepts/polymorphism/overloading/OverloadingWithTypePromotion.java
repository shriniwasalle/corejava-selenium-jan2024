package org.alpha.akash.oopconcepts.polymorphism.overloading;

public class OverloadingWithTypePromotion {

//    public void m1(int a) {
//        System.out.println(a);
//    }
//    public void m1(char a) {
//        System.out.println(a);
//    }
    public void m1(long f) {
        System.out.println(f);
    }
    public void m1(int age) {
        System.out.println("Age : " +age);
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
        OverloadingWithTypePromotion obj = new OverloadingWithTypePromotion();
        //obj.m1('a'); // Type Promotion : char -> int
        //obj.m1(100); // No Promotion
        obj.m1(105);
        // obj.getData('A', 'B'); // Compilation Error: Ambiguous method call

    }
}
