package org.alpha.sanjeevani.onlycorejavaconcepts.accessspecifier2;

import org.alpha.sanjeevani.onlycorejavaconcepts.accessspecifier1.TestAccessSpecifier1;

public class TestAccessSpecifier2 extends TestAccessSpecifier1 {
    public static void main(String[] args) {
        TestAccessSpecifier1 obj=new TestAccessSpecifier1();
        obj.m1();
        //obj.m2(); m2() private method  we can not access outside the class
        TestAccessSpecifier2 obj2=new TestAccessSpecifier2();
        obj2.m4();// we can access protected method ,but with inheritance relationship

    }
}
