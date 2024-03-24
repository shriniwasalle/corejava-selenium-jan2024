package org.alpha.tejashri.corejava.accessspecifier2;

import org.alpha.tejashri.corejava.accessspecifier1.TestAccessSpecifier1;

public class TestAccessSpecifier2 extends TestAccessSpecifier1 {
    public static void main(String[] args) {
        TestAccessSpecifier1 obj = new TestAccessSpecifier1();
        obj.m1(); // public m1 method can access anywhere in the same project
        //obj.m2(); //private method can access within TestAccessSpecifier1 class only
        //if private con not access in other/different class

        //obj.m3(); //default m3 method in TestAccessSpecifier1 class is present in accessspecifier1 package
        //but current class TestAccessSpecifier2 is present in accessspecifier2 package
        //so, Outside the package can not access

        TestAccessSpecifier2 obj1 = new TestAccessSpecifier2();
        obj1.m4(); // protected m4 method can access bcoz inheritance relationship between these 2 classes
        // if both classes from different packages can access if TestAccessSpecifier2 extends TestAccessSpecifier1
        // then only otherwise can not access
    }
}
