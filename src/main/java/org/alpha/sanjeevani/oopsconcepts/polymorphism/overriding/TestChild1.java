package org.alpha.sanjeevani.oopsconcepts.polymorphism.overriding;

public class TestChild1 extends TestParent1{
    public void mary(){
        //logic of child class
        System.out.println("inside the TestChild1 :: marry method");
    }
    public static void main(String[] args) {
       //case::1
        //TestChild1: object of TestChild1
        //TestChild1: reference of TestChild1
        //compiler will check if marry method present the TestChild1 class
        //if it is present then JVM will call the marry method of whoever created an object
        TestChild1 obj=new TestChild1();
        obj.mary();


        //case::2
        //TestParent1: object of TestParent1
        //TestParent1: reference of parent
        //compiler will check if marry method present the TestParent1 class
        //if it is present then JVM will call the marry method of whoever created an object
        TestParent1 obj2=new TestParent1();
        obj2.mary();

        //case::3
        //TestChild1: object of TestChild1
        //TestParent1: reference of parent
        //compiler will check if marry method present the TestParent1 class
        //if it is present then JVM at the run time will call the marry method of whoever created an object
        //if method is not present inside the method, then compilation error is thrown
        System.out.println("override occur here");
        TestParent1 obj3=new TestChild1();
        obj3.mary();

    }
}
