package org.alpha.sanjeevani.testngconcepts;

import org.testng.annotations.Test;

public class TestGroup1 {
    @Test(groups ="regression")
    public void testGroup1(){
        System.out.println("I am in testGroup1 method :: TestGroup1 :: with groups =regression");
    }
    @Test(groups = {"database-tests","regression"})
    public void testGroup2(){
        System.out.println("I am in  testGroup2 method :: TestGroup1 :: with database-tests regression");
    }
    @Test
    public void testGroup3(){
        System.out.println("I am in testGroup3 method :: TestGroup1");
    }

}
