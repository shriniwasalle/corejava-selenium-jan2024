package org.alpha.tejashri.oopsconcepts.inheritance.single;

public class TestChildSingle extends TestParentSingle {
    int age = 10;

    public void getData() {

        System.out.println(age); //10
        System.out.println(this.age); //10-current class called
        System.out.println(super.age); //100-parent class called
        System.out.println(name); //Teja
    }

    public void m1() {

        System.out.println("I am In Test Child :: m1 method");
        super.m1(); // by super called m1 method of parent class
    }

    public static void main(String[] args) {
        TestChildSingle obj = new TestChildSingle();
        //new TestChildSingle() : Object of TestChildSingle
        // obj is variable referring to TestChildSingle

        obj.getData();
        obj.getDetails();
        System.out.println(obj.age);
        System.out.println(obj.name);

        obj.m1(); // called m1 method of child method
    }
}
