package org.alpha.shriniwas.methods;

public class TestMethodWithLocalVariable {

    int a = 10;
    int b = 20;
    int c = 30;

    public void m1() {
        int a = 100;
        int b = 200;
        System.out.println(a + b); // 300
        System.out.println(c); // 30
        System.out.println(this.a + this.b); // 30
    }

    public void m2() {
        a = 100;
        b = 200;
        System.out.println(a + b); // 300
    }

    public void m3(int a , int b) {
        System.out.println(a+b); // 50
        System.out.println(this.a + this.b); // 30
    }

    public static void main(String[] args) {
//        TestMethodWithLocalVariable obj = new TestMethodWithLocalVariable();
//        obj.m1();
        // obj.m2();

        // Nameless Object Creation
        new TestMethodWithLocalVariable().m1();
        new TestMethodWithLocalVariable().m2();
        new TestMethodWithLocalVariable().m3(20, 30);
    }
}
