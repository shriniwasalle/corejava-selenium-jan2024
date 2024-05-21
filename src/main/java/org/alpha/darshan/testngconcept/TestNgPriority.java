package org.alpha.darshan.testngconcept;

import org.testng.annotations.Test;

public class TestNgPriority {

    @Test
    public void test1(){
        System.out.println("i am in test1");
    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("i am in test2");
    }

    @Test(priority = 1)
    public void test3(){
        System.out.println("i am in test3");
    }
    @Test
    public void test4(){
        System.out.println("i am in test4");
    }


}
