package org.alpha.aishwarya.accessspecifier1;

public class TestAccessSpecifier2 {
    public static void main(String[] args) {
        TestAccessSpecifier1 obj = new TestAccessSpecifier1();
        obj.m1();  // output = Inside m1 method : public
        //  obj.m2(); -> Private class -> only access within class.
        obj.m3();
        obj.m4();
    }


}
/** --- Output----
 * Inside method m1: which is Public
 * Inside method m3: which is Default
 * "Inside method m4: which is Protected
 */