package org.alpha.shriniwas.oopsconcepts.abstraction.abstractclass;

public class TestConstructorInAC extends TestConstructorInACParent {

    @Override
    public void m1() {
        System.out.println("Inside m1 method");
    }

    public static void main(String[] args) {
        TestConstructorInACParent ref = new TestConstructorInAC();
    }

}
