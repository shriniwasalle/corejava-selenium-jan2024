package org.alpha.shriniwas.oopsconcepts.inheritance;

public class TestMultipleChild extends TestMultipleParent1 {


    // { TestMultipleChild extends TestMultipleParent1, TestMultipleParent2 } Not allowed
    public static void main(String[] args) {
        TestMultipleChild obj = new TestMultipleChild();
        obj.getData();
    }
}
