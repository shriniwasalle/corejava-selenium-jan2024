package org.alpha.aishwarya.constructor;

public class TestConstructor1 {

    public TestConstructor1(){ //Zero Parameter Constructor
        int a=10;
        int b=20;
        System.out.println("I am in Zero Parameters Constructor");
        System.out.println("Addition is " + a+b);

    }


    public static void main(String[] args) {
      TestConstructor1 obj = new TestConstructor1();
      TestConstructor1 obj1 = new TestConstructor1();



    }
}
