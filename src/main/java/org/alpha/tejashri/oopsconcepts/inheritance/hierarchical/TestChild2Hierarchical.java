package org.alpha.tejashri.oopsconcepts.inheritance.hierarchical;

public class TestChild2Hierarchical extends TestParentHierarchical {
    String str = "Testing Automation";

    public void getData() {
        System.out.println(age);
        System.out.println(this.str);
        System.out.println(super.str);
    }

    public static void main(String[] args) {
        TestChild2Hierarchical obj2 = new TestChild2Hierarchical();
        obj2.getData(); //100
    }
}
