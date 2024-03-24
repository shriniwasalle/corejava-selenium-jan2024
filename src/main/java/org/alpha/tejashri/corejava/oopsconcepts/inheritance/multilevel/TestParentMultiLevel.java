package org.alpha.tejashri.corejava.oopsconcepts.inheritance.multilevel;

public class TestParentMultiLevel extends TestGrandParentMultiLevel {

    int id = 10;
    String str = "Shri";

    public void getDetails() {
        System.out.println("Length of str String : " + str.length()); // 4
        System.out.println("Salary : " + salary); // 10000.5f - called from grandparent class
    }

    public static void main(String[] args) {
        TestParentMultiLevel obj2 = new TestParentMultiLevel();
        obj2.getDetails();
        obj2.getEmployee(); //called from grandparent class
    }
}
