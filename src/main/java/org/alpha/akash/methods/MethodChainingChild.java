package org.alpha.akash.methods;

public class MethodChainingChild extends MethodChainingParent {

    public void m1(){
        System.out.println("I am M1 Method");
    }
    public void m2(){
        m1();// o/p:- m1
        System.out.println("I am M2 Method");
    }
    public void m3(){

        this.m2();//o/p:-m2
        super.m2();//o/p:- Parent m2
        System.out.println("I am M3 Method");
    }

    public static void main(String[] args) {

        new MethodChainingChild().m3();//m1,m2,m3
//        new MethodChainingChild().m2();//m2
//        new MethodChainingChild().m1();//m1

    }
}
