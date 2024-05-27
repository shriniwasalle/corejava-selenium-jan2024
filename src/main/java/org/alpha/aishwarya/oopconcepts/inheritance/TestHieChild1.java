package org.alpha.aishwarya.oopconcepts.inheritance;

public class TestHieChild1 extends TestHieParent {
     // Seperate main method lihne
    public void getData() {
        System.out.println(age);
    }


    public static void main(String[] args) {
        TestHieChild1 obj = new TestHieChild1();
        obj.getData();
    }
}
