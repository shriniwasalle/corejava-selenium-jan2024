package org.alpha.tejashri.corejava.oopsconcepts.polymorphism.methodoverriding.methodhiding;

public class TestChild1MethodHidingInMain extends TestParent1MethodHidingInMain {
    public static void main(int age) {

        System.out.println("I am Child Main Method : " +age);
    }

    public static void main(String[] args) {
        TestChild1MethodHidingInMain obj1 = new TestChild1MethodHidingInMain();
        obj1.main(100); // child main method

        TestParent1MethodHidingInMain obj2 = new TestChild1MethodHidingInMain();
        obj2.main(200); // Parent main method instead of child main method
        //Method Hiding : Child main method got Hide here bcoz
        //here child object created with reference of parent class but
        //Static methods are linked with classes, not with Objects
        // whoever class object but reference class of that object is matters

        TestParent1MethodHidingInMain obj3 = new TestParent1MethodHidingInMain();
        obj3.main(300); // Parent main method
    }
}

//-----------Output----------
//I am Child Main Method : 100
//I am Parent Main Method : 200
//I am Parent Main Method : 300