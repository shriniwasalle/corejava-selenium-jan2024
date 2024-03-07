package org.alpha.darshan.methods;

public class MethodWithTypePramotion {


    public void m1(int age){
        System.out.println(age);
    }

    public void m2(byte f){
        System.out.println(f);
    }


    public static void main(String[] args) {
        MethodWithTypePramotion p1= new MethodWithTypePramotion();
        p1.m1('a');
    }
}
