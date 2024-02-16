package org.alpha.sanjeevani.methods;

public class TestMethodChainingChild extends TestMethodChainingParent {
    public void m1(){
        System.out.println("i am in m1 method");
    }
    public void m2(){
        m1();
        System.out.println("i am in child m2 method");

    }
    public void m3(){
        this.m2();
        super.m2();
        m4();
        System.out.println("i am in m3 method");

    }
    public static void main(String[] args) {
        TestMethodChainingChild obj=new TestMethodChainingChild();
        obj.m3();
    }

}
