package org.alpha.darshan.testngconcept;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestClass1 {

    @Test
    @Ignore
    public void test1(){
        System.out.println("i am in test method 1");
    }

    @Test(enabled = false)
    public void test2(){
        System.out.println("i am in test method 2");
    }

    @Test
    public void test3(){
        System.out.println("i am in test method 3");
    }
}
