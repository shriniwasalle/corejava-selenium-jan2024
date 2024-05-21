package org.alpha.darshan.methods;

public class TestMethodWithParameter {


    public void m1(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        TestMethodWithParameter obj = new TestMethodWithParameter();
        obj.m1(100,200);
        obj.m1(200,300);
        obj.m1(400,500);
    }
}
