package org.alpha.darshan.accesspecifiers2;

public class TestSpecifier1 {


    public void m1(){
        System.out.println("i am in m1 method of testspecifier1");
    }

    protected void m2(){
        System.out.println("i am in m2 method of testspecifier1");
    }

    private void m3(){
        System.out.println("i am in m1 method of testspecifier1:private");
    }

    public static void main(String[] args) {
        TestSpecifier1 ts= new TestSpecifier1();
        ts.m2();// we can access protected within the same package
    }
}
