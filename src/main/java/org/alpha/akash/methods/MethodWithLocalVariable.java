package org.alpha.akash.methods;

public class MethodWithLocalVariable {
    int a=10;
    int b=20;
    int c = 30;

    public void m1() {

        int a= 100;
        int b = 200;
        System.out.println(a+b);//300
        System.out.println(c);//30
        System.out.println(this.a + this.b);//30
    }
    public void m2() {
        int a = 100;
        int b = 200;
        System.out.println(a+b);//300
    }
    public void m3(int a,int b) {
        System.out.println(a+b);//40
        System.out.println(this.a+this.b);//30
    }

    public static void main(String[] args) {

//        MethodWithLocalVariable obj = new MethodWithLocalVariable();
//        obj.m1();
//        obj.m2();
        //  Or //
        new MethodWithLocalVariable().m1();
        new MethodWithLocalVariable().m2();
        new MethodWithLocalVariable().m3(20,20);
    }

}
