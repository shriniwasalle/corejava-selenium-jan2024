package org.alpha.darshan.opponcept.polymorphisam.overriding;



public class TestMethodHidingChild extends TestMethodHidingParent {

    public static void m1(){
        System.out.println("i am in testmethodhidingchild");
    }

    public static void main(String[] args) {

        TestMethodHidingParent p1 = new TestMethodHidingChild();
        p1.m1();//if we are trying to overload a static method then it will hide the child class method
        //and call parent class method
    }
}
