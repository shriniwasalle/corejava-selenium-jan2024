package org.alpha.tejashri.oopsconcepts.inheritance.multipleandhybrid;

public class TestChild extends TestParent1 {
// public class TestChild extends TestParent1, TestParent2 {       }
// this is not possible in Multiple & Hybrid Inheritance due to Ambiguity / Diamond problem

    String str = "abc";

    public static void main(String[] args) {
        TestChild obj = new TestChild();
    }
}
