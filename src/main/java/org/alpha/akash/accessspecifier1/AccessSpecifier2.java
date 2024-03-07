package org.alpha.akash.accessspecifier1;

public class AccessSpecifier2 {

    public static void main(String[] args) {
        AccessSpecifier1 obj = new  AccessSpecifier1 ();
        obj.m1();
        //obj.m2(); // m2 method is private in TestAccessSpecifier1 class
        obj.m3();
        obj.m4();
    }
}
