package org.alpha.shriniwas.accessspecifier2;

import org.alpha.shriniwas.accessspecifier1.TestAccessSpecifier1;

public class TestAccessSpecifier2 extends TestAccessSpecifier1 {

    public static void main(String[] args) {
        TestAccessSpecifier1 obj = new TestAccessSpecifier1();
        obj.m1();
        // obj.m2(); // m2 method is private in TestAccessSpecifier1 class
        // obj.m3();

        TestAccessSpecifier2 obj1 = new TestAccessSpecifier2();
        obj1.m4();
    }
}
