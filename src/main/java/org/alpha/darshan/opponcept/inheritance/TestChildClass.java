package org.alpha.darshan.opponcept.inheritance;

import org.alpha.darshan.custructors.TestChild;

public class TestChildClass extends TestParentClass {

    int age=50;// age variable also present in parent class but 1st preference goes to current class

    public void getDetails(){
        System.out.println(age);//we can directly access the variables and methods present inside the parent class
        System.out.println(super.age);
        this.m1();//it will call current class method
        super.m1();//it will call parent cass method
    }

    public void m1(){
        System.out.println("I am in test child class");
    }

    public static void main(String[] args) {
        TestChildClass t1= new TestChildClass();
        t1.getData();
        t1.getDetails();
        t1.m1();
    }
}
