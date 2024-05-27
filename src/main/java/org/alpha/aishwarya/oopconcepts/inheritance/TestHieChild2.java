package org.alpha.aishwarya.oopconcepts.inheritance;

public class TestHieChild2 extends TestHieParent {

    public void getData() {
        System.out.println(age);
    }


    public static void main(String[] args) {
        TestHieChild2 obj = new TestHieChild2();
        obj.getData();
    }
}
