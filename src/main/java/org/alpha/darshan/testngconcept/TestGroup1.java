package org.alpha.darshan.testngconcept;

import org.testng.annotations.Test;

public class TestGroup1 {

    @Test(groups = "regression")
    public void test1(){
        System.out.println("i am in test method 1");
    }

    @Test(groups = "database-Test")
    public void test2(){
        System.out.println("i am in test method 2");
    }

    @Test(groups = "regression")
    public void test3(){
        System.out.println("i am in test method 3");
    }
}
