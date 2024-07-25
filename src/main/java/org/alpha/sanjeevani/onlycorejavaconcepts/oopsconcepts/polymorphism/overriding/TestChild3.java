package org.alpha.sanjeevani.onlycorejavaconcepts.oopsconcepts.polymorphism.overriding;

public class TestChild3 extends TestParent3 {
    public int m1() {
        return 10;
    }

    public String m2() {//covariant return type ()String to Object
        return "sanjeevani";
    }

    public Short m3() { //covariant return type Short to Number
        return 20;
    }

    public static void main(String[] args) {
        TestParent3 obj = new TestChild3();
        System.out.println(obj.m1());
        System.out.println(obj.m2());
        System.out.println(obj.m3());
    }
}
