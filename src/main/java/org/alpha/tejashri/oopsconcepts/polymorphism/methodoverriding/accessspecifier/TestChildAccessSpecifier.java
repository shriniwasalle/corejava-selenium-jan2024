package org.alpha.tejashri.oopsconcepts.polymorphism.methodoverriding.accessspecifier;

public class TestChildAccessSpecifier extends TestParentAccessSpecifier {
    @Override
    public void m1() {
        System.out.println("In side Child m1 public method");
    }

    @Override
    protected void m2() {
        System.out.println("In side Child m2 protected method");
    }

    void m3() {
        System.out.println("In side Child m3 default method");
    }

    // can not override the private methods, can access within class only
    private void m4() {
        System.out.println("In side Child m4 private method");
    }

    public static void main(String[] args) {
        System.out.println("---Child object with child reference class---");
        TestChildAccessSpecifier obj1 = new TestChildAccessSpecifier();
        obj1.m1();
        obj1.m2();
        obj1.m3();
        obj1.m4();
        System.out.println();

        System.out.println("---Parent object with Parent reference class---");
        TestParentAccessSpecifier obj2 = new TestParentAccessSpecifier();
        obj2.m1();
        obj2.m2();
        //obj2.m3();//obj2.m3(); //m3 not present in parent class
        // but present in child class can not access child methods in parent object

        //obj2.m4(); // can not access parent m4 private method in this class
        System.out.println();

        System.out.println("---Child object with Parent reference class---");
        TestParentAccessSpecifier obj3 = new TestChildAccessSpecifier();

        obj3.m1();
        obj3.m2();
        //obj2.m3(); //m3 not present in parent,
        // but present in child can not access child methods with reference of parent class

        //obj2.m4(); //can not access parent m4 private method in this class
    }

}
