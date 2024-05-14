package org.alpha.darshan.testngconcept;

import org.testng.annotations.Test;

public class TestGroup2 {
    @Test(groups = "database-Test")
    public void test4(){
        System.out.println("i am in test method 4");
    }

    @Test(groups = "database-Test")
    public void test5(){
        System.out.println("i am in test method 5");
    }

    @Test(groups = "regression")
    public void test6(){
        System.out.println("i am in test method 6");
    }
}
