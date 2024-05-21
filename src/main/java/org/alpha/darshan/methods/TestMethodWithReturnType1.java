package org.alpha.darshan.methods;

public class TestMethodWithReturnType1 {

    public  int multiPlication(int a, int b){

        int c= a*b;

        return c;

    }
    public static void main(String[] args) {

        TestMethodWithReturnType1 mul= new TestMethodWithReturnType1();

        int c=mul.multiPlication(20,30);
        System.out.println(c);
    }
}
