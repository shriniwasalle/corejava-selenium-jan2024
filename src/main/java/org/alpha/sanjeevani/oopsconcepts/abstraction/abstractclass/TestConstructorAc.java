package org.alpha.sanjeevani.oopsconcepts.abstraction.abstractclass;

public class TestConstructorAc extends TestConstructorParentAc{

   /*public TestConstructorAc(){  TestConstructorAc have its own constructor ,then super() will be the first statement
    that's why we call the constructor without creating object of the abstract class
       super();
   }*/

    public void m1(){
        System.out.println("I am in m1 method of :: TestConstructorAc");
    }
    public static void main(String [] args){
        TestConstructorParentAc ref=new TestConstructorAc();
        ref.m1();
    }
}
