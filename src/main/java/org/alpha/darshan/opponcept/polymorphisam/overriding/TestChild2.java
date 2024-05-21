package org.alpha.darshan.opponcept.polymorphisam.overriding;

public class TestChild2 extends TestParent{
    public void m1(){
        System.out.println("i am in m1 method of testchild2");
    }

    public static void main(String[] args) {
        TestParent p1= new TestChild2();
        p1.m1();
    }
}
