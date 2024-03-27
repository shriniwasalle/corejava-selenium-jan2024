package org.alpha.shriniwas.oopsconcepts.polymorphism.overriding;

public class TestChild3 extends TestParent3 {

    @Override
    public int m1() {
        return 10;
    }

    @Override
    public Short m2() {
        return 10;
    }

    public static void main(String[] args) {
        TestParent3 obj1 = new TestChild3();
        System.out.println(obj1.m1());
        System.out.println(obj1.m2());
    }

}
