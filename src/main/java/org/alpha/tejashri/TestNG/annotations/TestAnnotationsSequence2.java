package org.alpha.tejashri.TestNG.annotations;

import org.testng.annotations.*;

public class TestAnnotationsSequence2 {
//Suite->Test->Class->Method->@Test
//BeforeSuite->BeforeTest->BeforeClass->BeforeMethod->Test1->AfterMethod->BeforeMethod->Test2->AfterMethod->AfterClass->AfterTest->AfterSuite

    @BeforeClass
    public  void beforeClass(){
        System.out.println("   Inside TestAnnotationsSequence2 :: BeforeClass Method");
    }

    @AfterClass
    public  void afterClass(){
        System.out.println("   Inside TestAnnotationsSequence2 :: AfterClass Method");
    }

    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("     Inside  TestAnnotationsSequence2 :: BeforeMethod Method");
    }

    @AfterMethod
    public  void afterMethod(){
        System.out.println("     Inside TestAnnotationsSequence2 :: AfterMethod Method");
    }

    @Test
    public void test3(){
        System.out.println("         Inside TestAnnotationsSequence2 :: Test3 Method");
    }

    @Test
    public void test4(){
        System.out.println("         Inside  TestAnnotationsSequence2 :: Test4 Method");
    }
}
