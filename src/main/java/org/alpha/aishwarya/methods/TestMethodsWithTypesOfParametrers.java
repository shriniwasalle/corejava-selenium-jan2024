package org.alpha.aishwarya.methods;

public class TestMethodsWithTypesOfParametrers {

    public void m1(int a, float b ){
        System.out.println("Test ");
    }


    public void m1(float a, float b ){
        System.out.println("Test ");
    }

    public static void main(String[] args) {

        TestMethodsWithTypesOfParametrers obj = new TestMethodsWithTypesOfParametrers();
        obj.m1(10,10.5f);
        obj.m1(10.5f,10.5f);



    }

}
