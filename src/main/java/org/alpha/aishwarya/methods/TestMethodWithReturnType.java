package org.alpha.aishwarya.methods;

public class TestMethodWithReturnType {


    public int m1(int a, int b) {
        int c = a + b;
        //System.out.println("Addition " + c);
        return c;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        TestMethodWithReturnType obj = new TestMethodWithReturnType();
        int addtion = obj.m1(10, 20); //30
        System.out.println("Addtion of retrun type variable " + addtion);

        int c = obj.mul(10, 20);
        System.out.println(c);  // 200
    }
}

/**
 * --- output---
 * Addtion of retrun type variable 30
 * 200
 */