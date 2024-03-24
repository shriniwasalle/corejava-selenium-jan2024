package org.alpha.tejashri.corejava.oopsconcepts.inheritance.multilevel;

public class TestGrandParentMultiLevel {
    // by default this class extends the object class, so we can access all methods/variables from object class
    int age = 100;
    String empName = "Teja";
    String str1 = "teja";
    float salary = 10000.5f;

    public void getEmployee() {
        System.out.println("empName & str1 are same : " + empName.equals(str1)); // equals() method called from object class
    }
}
