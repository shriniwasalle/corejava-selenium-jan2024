package org.alpha.sanjeevani.oopsconcepts.inheritance;


//single inheritance
public class TestChild extends TestParent {
    int age = 10;

    public void getData() {
        System.out.println(this.age);
        System.out.println(super.age);
        System.out.println(str);
    }

    public void m1() {
        System.out.println("I am in TestChild :: m1 method");
        super.m1();
    }

    public static void main(String[] args) {
        TestChild oj = new TestChild();
        oj.getData();
        oj.getDetails();
        oj.m1();
    }
}
