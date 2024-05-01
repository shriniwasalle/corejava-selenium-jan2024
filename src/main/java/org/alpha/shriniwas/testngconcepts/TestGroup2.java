package org.alpha.shriniwas.testngconcepts;

import org.testng.annotations.Test;

public class TestGroup2 {

    @Test(groups = "regression")
    public void test5() {
        System.out.println("Inside TestGroup2 :: Test5 method");
    }

    @Test
    public void test6() {
        System.out.println("Inside TestGroup2 :: Test6 method");
    }

    @Test(groups = "regression")
    public void test7() {
        System.out.println("Inside TestGroup2 :: Test7 method");
    }

    @Test
    public void test8() {
        System.out.println("Inside TestGroup2 :: Test8 method");
    }
}
