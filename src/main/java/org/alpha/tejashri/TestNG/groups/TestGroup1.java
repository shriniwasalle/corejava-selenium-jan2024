package org.alpha.tejashri.TestNG.groups;

import org.testng.annotations.Test;

public class TestGroup1 {

    //groups accepts string[]
    @Test(groups = "regression")
    public void test1() {
        System.out.println("Inside Test Group1 :: Test1 Method");
    }

    //{ , , , } Works like or operator-->regression or database-tests
    @Test(groups = {"regression", "database-tests"})
    public void test2() {
        System.out.println("Inside Test Group1 :: Test2 Method");
    }

    @Test(groups = "regression")
    public void test3() {
        System.out.println("Inside Test Group1 :: Test3 Method");
    }

    @Test(groups = {"regression", "database-tests"})
    public void test4() {
        System.out.println("Inside Test Group1 :: Test4 Method");
    }

    @Test(groups = "database-tests")
    public void test5() {
        System.out.println("Inside Test Group1 :: Test5 Method");
    }

    @Test
    public void test6() {
        System.out.println("Inside Test Group1 :: Test6 Method");
    }

    @Test(groups = "database-testNG")
    public void test7() {
        System.out.println("Inside Test Group1 :: Test7 Method");
    }

    @Test(groups = "testing-database")
    public void test8() {
        System.out.println("Inside Test Group1 :: Test8 Method");
    }

    @Test(groups = "database-tests")
    public void test9() {
        System.out.println("Inside Test Group1 :: Test9 Method");
    }

    @Test(groups = "database-testNG")
    public void test10() {
        System.out.println("Inside Test Group1 :: Test10 Method");
    }

}
