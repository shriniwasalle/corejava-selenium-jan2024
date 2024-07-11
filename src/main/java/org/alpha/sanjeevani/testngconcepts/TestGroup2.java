package org.alpha.sanjeevani.testngconcepts;

import org.testng.annotations.Test;

public class TestGroup2 {

    @Test(groups = "regression")
    public void testGroup4(){
        System.out.println("I am in testGroup14 method");
    }
    @Test
    public void testGroup5(){
        System.out.println("I am in testGroup5 method");
    }
    @Test
    public void testGroup6(){
        System.out.println("I am in testGroup6 method");
    }

}
