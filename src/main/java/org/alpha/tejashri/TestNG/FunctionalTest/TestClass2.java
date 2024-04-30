package org.alpha.tejashri.TestNG.FunctionalTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 {

    @Test
    public void test4() {
        System.out.println("Inside Test Class2 :: Test4 Method");
    }

    @Test
    public void test5() {
        System.out.println("Inside Test Class2 :: Test5 Method");
    }

    @Test
    public void test6() {
        System.out.println("Inside Test Class2 :: Test6 Method");
        Assert.assertEquals(100, 10);
    }
}
