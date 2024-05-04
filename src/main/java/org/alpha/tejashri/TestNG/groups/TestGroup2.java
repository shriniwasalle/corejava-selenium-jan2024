package org.alpha.tejashri.TestNG.groups;

import org.testng.annotations.Test;

public class TestGroup2 {

    @Test(groups = {"regression", "database-tests"})
    public void test11() {
        System.out.println("Inside Test Group2 :: Test11 Method");
    }

    @Test(groups = "database-testNG")
    public void test22() {
        System.out.println("Inside Test Group2 :: Test22 Method");
    }

    @Test(groups = "testing-database")
    public void test33() {
        System.out.println("Inside Test Group2 :: Test33 Method");
    }

    @Test(groups = "database-tests")
    public void test44() {
        System.out.println("Inside Test Group2 :: Test44 Method");
    }

    @Test(groups = "regression")
    public void test55() {
        System.out.println("Inside Test Group2 :: Test55 Method");
    }

    @Test(groups = {"regression", "database-tests"})
    public void test66() {
        System.out.println("Inside Test Group2 :: Test66 Method");
    }

    @Test
    public void test77() {
        System.out.println("Inside Test Group2 :: Test77 Method");
    }

    @Test(groups = "database-testNG")
    public void test88() {
        System.out.println("Inside Test Group2 :: Test88 Method");
    }

    @Test(groups = "regression")
    public void test99() {
        System.out.println("Inside Test Group2 :: Test99 Method");
    }

    @Test(groups = "database-tests")
    public void test1010() {
        System.out.println("Inside Test Group2 :: Test1010 Method");
    }

}
