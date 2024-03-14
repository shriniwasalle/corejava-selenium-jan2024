package org.alpha.darshan.opponcept.polymorphisam.overriding;


public class TestChild1 extends  TestParent{

    @Override
    public void m1(){
        System.out.println("i am in m1 method of testchild1");
    }

    public static void main(String[] args) {
        TestParent p1= new TestChild1();
        p1.m1();
    }
}
