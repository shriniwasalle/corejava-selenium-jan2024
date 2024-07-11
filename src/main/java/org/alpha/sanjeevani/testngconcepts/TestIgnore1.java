package org.alpha.sanjeevani.testngconcepts;

import org.testng.annotations.Test;

public class TestIgnore1 {
    @Test(enabled=false)
    public void test1(){
        System.out.println("I am in testIgnore1 method");
    }
    @Test
    public void test2(){
        System.out.println("I am in  testIgnore2 method");
    }
    @Test
    public void test3(){
        System.out.println("I am in testIgnore3 method");
    }

}
