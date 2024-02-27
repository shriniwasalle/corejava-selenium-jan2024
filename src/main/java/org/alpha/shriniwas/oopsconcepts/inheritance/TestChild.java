package org.alpha.shriniwas.oopsconcepts.inheritance;

public class TestChild extends TestParent {

    int age = 10;

    public void getData() {
        System.out.println(age); // 10
        System.out.println(this.age); // 10
        System.out.println(super.age); // 100
        System.out.println(name); // Shri
    }

    public void m1() {
        System.out.println("I am in TestChild :: m1 method");
        super.m1();
    }

    public static void main(String[] args) {
        TestChild obj = new TestChild();

        // TestChild ka Object
        // TestChild ka Reference

        obj.getData();
        obj.getDetails();

        System.out.println(obj.age);
        System.out.println(obj.name);

        obj.m1();
    }
}
