package org.alpha.akash.methods;

public class MethodWithParameters {

    public void add(int a, int b) {

        System.out.println(a+b);//

    }
    public void add(int a, int b, int c) {

        System.out.println(a+b+c);//

    }

    public static void main(String[] args) {
        MethodWithParameters obj = new MethodWithParameters();
            obj.add(10,20);
            obj.add(10,20,30);

    }
}
