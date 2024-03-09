package org.alpha.akash.oopconcepts.polymorphism.overloading;

public class Overloading {

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.getdata();
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {

        System.out.println(a + b + c);

    }

    public void getdata() {
        System.out.println("Oveloading : getdata");
    }
}
