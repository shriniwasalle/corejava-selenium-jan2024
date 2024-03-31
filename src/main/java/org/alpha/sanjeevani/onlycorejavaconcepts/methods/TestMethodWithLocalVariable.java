package org.alpha.sanjeevani.onlycorejavaconcepts.methods;

public class TestMethodWithLocalVariable {
    int a=10;
    int b=20;
    public void m1(){
        int a=100;
        int b=200;
        System.out.println(a+b);
        System.out.println(this.a+this.b);
    }
    public void m2(){
        a=50;
        b=60;
        System.out.println(a+b);
    }
    public void m3(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        //nameless object creation
       new TestMethodWithLocalVariable().m1();
       new TestMethodWithLocalVariable().m2();
        new TestMethodWithLocalVariable().m3(45,45);
    }
}
