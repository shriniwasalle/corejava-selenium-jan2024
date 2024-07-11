package org.alpha.sanjeevani.testngconcepts;

import org.testng.annotations.Test;

public class TestGroup1 {
    @Test(groups ="regression")
    public void testGroup1(){
        System.out.println("I am in testGroup1 method");
    }
    @Test(groups = "database-tests")
    public void testGroup2(){
        System.out.println("I am in  testGroup2 method");
    }
    @Test
    public void testGroup3(){
        System.out.println("I am in testGroup3 method");
    }

}
