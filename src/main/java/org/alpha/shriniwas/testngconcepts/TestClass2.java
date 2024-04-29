package org.alpha.shriniwas.testngconcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 {

    @Test
    public void test4() {
        System.out.println("Inside test4 method");
    }

    @Test
    public void test5() {
        System.out.println("Inside test5 method");
    }

    @Test
    public void test6() {
        System.out.println("Inside test6 method");
        Assert.assertEquals(10, 100); // Fail
    }
}
