package org.alpha.tejashri.oopsconcepts.inheritance.multilevel;

public class TestChildMultiLevel extends TestParentMultiLevel {
    int age = 500;

    public void getData() {

        System.out.println(id); //10- called from parent
        System.out.println(this.age); //500- called current class variable
        System.out.println(super.age); //100- called from Grand parent
    }

    public static void main(String[] args) {
        TestChildMultiLevel obj1 = new TestChildMultiLevel();
        obj1.getData();
        obj1.getDetails(); // called parent class method
        obj1.getEmployee(); // called Grandparent class method

        TestParentMultiLevel obj2 = new TestParentMultiLevel();
        // parent class object created to access parent class variables/methods
        System.out.println(obj2.age); // 100- called from Grand parent
        System.out.println(obj2.id); // 10- called from parent

        TestGrandParentMultiLevel obj3 = new TestGrandParentMultiLevel();
        // Grandparent class object created to access Grandparent class variables/methods
        System.out.println(obj3.age); // 100- called from Grand parent

    }
}
