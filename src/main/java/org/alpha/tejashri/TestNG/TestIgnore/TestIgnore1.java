package org.alpha.tejashri.TestNG.TestIgnore;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestIgnore1 {

    //1. By commenting Whole @Test method
//    @Test
//    public void test() {
//        System.out.println("Inside Test Ignore1 :: Test Method");
//    }

    //2. By commenting only @Test annotation line
    //    @Test
    public void test1() {
        System.out.println("Inside Test Ignore1 :: Test1 Method");
    }

    //3. By using @Ignore annotation for @Test method
    @Test
    @Ignore
    public void test2() {
        System.out.println("Inside Test Ignore1 :: Test2 Method");
        Assert.assertEquals("Shri123", "Shri456");
    }
    //4. By using @Test(enabled = false)
    //By default value of enabled = true
    @Test(enabled = false)
    public void test3() {
        System.out.println("Inside Test Ignore1 :: Test3 Method");
    }

    @Test
    public void test4() {
        System.out.println("Inside Test Ignore1 :: Test4 Method");
    }

    //5.By using <include> & <exclude> tags in .xml file
}

