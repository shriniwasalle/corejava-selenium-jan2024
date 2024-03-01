package org.alpha.shriniwas.oopsconcepts.inheritance;

public class TestHieChild1 extends TestHieParent {
    public void getData() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        TestHieChild1 obj = new TestHieChild1();
        obj.getData(); // 100
    }
}