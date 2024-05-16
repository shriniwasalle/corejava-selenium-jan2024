package org.alpha.shriniwas.testngconcepts;

import org.testng.annotations.*;

public class TestAnnotations2 {

    @BeforeClass
    public void beforeClass() {
        System.out.println("  Inside TestAnnotations2 :: BeforeClass method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("  Inside TestAnnotations2 :: AfterClass method");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("      Inside TestAnnotations2 :: BeforeMethod method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("      Inside TestAnnotations2 :: AfterMethod method");
    }

    @Test
    public void test3() {
        System.out.println("            Inside TestAnnotations2 :: Test3 method");
    }

    @Test
    public void test4() {
        System.out.println("            Inside TestAnnotations2 :: Test4 method");
    }
}
