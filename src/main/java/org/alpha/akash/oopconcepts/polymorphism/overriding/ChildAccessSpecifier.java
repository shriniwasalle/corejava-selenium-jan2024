package org.alpha.akash.oopconcepts.polymorphism.overriding;

public class ChildAccessSpecifier extends ParentAccessSpecifier {

    private  void m1() {
        System.out.println("ChildAccessSpecifier Class :: m1 method");
    }

    public static void main(String[] args) {
        ChildAccessSpecifier obj =new ChildAccessSpecifier();
        obj.m1();
    }
}
