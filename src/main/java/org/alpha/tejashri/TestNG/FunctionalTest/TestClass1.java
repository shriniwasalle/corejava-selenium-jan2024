package org.alpha.tejashri.TestNG.FunctionalTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {
    @Test
    public void test1() {
        System.out.println("Inside Test Class1 :: Test1 Method");
    }

    @Test
    public void test2() {
        System.out.println("Inside Test Class1 :: Test2 Method");
        Assert.assertEquals("Shri123", "Shri456");
    }

    @Test
    public void test3() {
        System.out.println("Inside Test Class1 :: Test3 Method");
    }
}

