package org.alpha.darshan.accessspecifiers1;

import org.alpha.darshan.accesspecifiers2.TestSpecifier1;

public class TestSpecifier2 extends TestSpecifier1 {

    public void m2(){
        System.out.println("i am in m2 method of testspecifier2");
    }//it will showing that m2() method get ob=override but actually it cant while me call m2() method it will show
    //error bcz protected can access within the same package and same class for overriding we need relation between two class

    public static void main(String[] args) {
        TestSpecifier1 t1= new TestSpecifier2();
        t1.m1(); //public access specifier can be access thought the project
        //t1.m2(); // we can not access the protected method outside the package
    }
}
