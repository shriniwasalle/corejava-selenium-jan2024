package org.alpha.shriniwas.testngconcepts;

import org.testng.annotations.Test;

public class TestGroup1 {

    @Test(groups = { "regression", "database-tests" } )
    public void test1() {
        System.out.println("Inside TestGroup1 :: Test1 method");
    }

    @Test(groups = "database-tests")
    public void test2() {
        System.out.println("Inside TestGroup1 :: Test2 method");
    }

    @Test(groups = "regression")
    public void test3() {
        System.out.println("Inside TestGroup1 :: Test3 method");
    }

    @Test(groups = "database-tests")
    public void test4() {
        System.out.println("Inside TestGroup1 :: Test4 method");
    }

    @Test(groups = "testing-database-testing")
    public void test21() {
        System.out.println("Inside TestGroup1 :: Test2 method");
    }
}
