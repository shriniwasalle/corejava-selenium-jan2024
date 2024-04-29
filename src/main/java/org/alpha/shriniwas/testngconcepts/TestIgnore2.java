package org.alpha.shriniwas.testngconcepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestIgnore2 {

    @Test
    @Ignore
    public void test4() {
        System.out.println("Inside test4 method");
    }

    @Test(enabled = false)
    public void test5() {
        System.out.println("Inside test5 method");
    }

    @Test
    public void test6() {
        System.out.println("Inside test6 method");
    }
}
