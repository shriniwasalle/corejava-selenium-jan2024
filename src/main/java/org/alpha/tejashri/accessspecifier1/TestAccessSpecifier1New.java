package org.alpha.tejashri.accessspecifier1;

public class TestAccessSpecifier1New {

    public static void main(String[] args) {

        TestAccessSpecifier1 obj = new TestAccessSpecifier1(); // object of TestAccessSpecifier1 class created
        // to access methods of same class

        obj.m3(); // default method can access bcoz in same package accessspecifier1 even tho no relationship between them
        obj.m4(); // protected method can access bcoz in same package accessspecifier1 even tho no relationship between them
        // bcoz present in same package
    }
}
