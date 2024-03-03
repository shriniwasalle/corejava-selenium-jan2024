package org.alpha.aishwarya.oopconcepts.polymorphism.Overloading;

public class TestOverloading1 {
    public void Add(int a , int b){
        System.out.println(a+b);
    }

    public void Add(int a,int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        TestOverloading1 obj = new TestOverloading1();
        obj.Add(10,20);
        obj.Add(10,20,30);

    }
}
