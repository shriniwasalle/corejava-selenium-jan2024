package org.alpha.shriniwas.testngconcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {

    @Test
    public void test1() {
        System.out.println("Inside test1 method");
    }

    @Test
    public void test2() {
        System.out.println("Inside test2 method");
        Assert.assertEquals("Shri123", "Shri456"); // Fail
    }

    @Test
    public void test3() {
        System.out.println("Inside test3 method");
    }
}
