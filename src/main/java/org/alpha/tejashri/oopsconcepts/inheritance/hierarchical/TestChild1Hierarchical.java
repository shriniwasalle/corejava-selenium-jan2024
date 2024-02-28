package org.alpha.tejashri.oopsconcepts.inheritance.hierarchical;

public class TestChild1Hierarchical extends TestParentHierarchical {

    public void getData() {
        System.out.println(age);
        System.out.println(str);
    }

    public static void main(String[] args) {
        TestChild1Hierarchical obj1 = new TestChild1Hierarchical();
        obj1.getData(); //100
        obj1.m1();
    }
}
