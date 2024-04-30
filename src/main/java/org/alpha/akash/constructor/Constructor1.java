package org.alpha.akash.constructor;

public class Constructor1 {

    public Constructor1() {
        int a = 100;
        int b = 200;

        System.out.println("I am in 0-Arg Constructor");
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        Constructor1 obj = new Constructor1();
        Constructor1 obj1 = new Constructor1();
    }
}
