package org.alpha.tejashri.oopsconcepts.polymorphism.methodoverloading.withtypepromotion;

public class TestOverloadingWithTypePromotion1 {
    public void m1(double d) {
        System.out.println(d);
    }

    public void m1(String str) {
        System.out.println(str);
    }
    // These above 2 m1 methods are overloaded -in same class, 2 same method names,
    // with diff parameters, with diff logic/behaviour

    public static void main(String[] args) {
        TestOverloadingWithTypePromotion1 obj = new TestOverloadingWithTypePromotion1();
        obj.m1(200.5d); //double
        obj.m1("String m1 Method" +'\n'); // Escape sequence -\n Newline

        System.out.println("---Type Promotion char,byte,short,int,long,float to double---");
        obj.m1('A'); //char
        obj.m1(126); //byte
        obj.m1(32766); //short
        obj.m1(2147483); //int
        obj.m1(923372039); //long
        obj.m1(100.5f); //float
    }
}
