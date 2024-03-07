package org.alpha.darshan.opponcept.inheritance;

public class TestChild1 extends TestParent1{


    int age=10;
    @Override
    public void testMethod(){
        System.out.println(age);// we created test child object then 1st priority is to the
        //current class
        System.out.println(super.age);//if we use super keyword then it will  call to the parent class variable
        System.out.println(this.age);//if we use this keyword then it will call the current class variable.
        System.out.println("i am testmethod in child class");

    }
    public void m1(){
        System.out.println("i am in test child m1 method");
        super.m1();
       // this.m1();
    }
    public static void main(String[] args) {
        TestParent1 p1= new TestChild1();
        //child object child reference
        /*here we gave testparent1 as a refrence then it will check testmethod in testparent1 class
        * but at the time of execution jvm will check same method is present in test child then
        * test child method get executed this is the run time polymorphism example*/
        p1.testMethod();
        p1.m1();
    }
}
