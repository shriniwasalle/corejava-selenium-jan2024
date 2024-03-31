package org.alpha.sanjeevani.onlycorejavaconcepts.methods;

public class TestMethodWithoutParam {
    public void m1() {
        System.out.println("I am in m1 method");
    }
        public void m2(){
            System.out.println("I am in m2 method");
        }

    public static void main(String[] args) {
        TestMethodWithoutParam obj=new TestMethodWithoutParam();
        obj.m1();
        obj.m2();

    }
}
