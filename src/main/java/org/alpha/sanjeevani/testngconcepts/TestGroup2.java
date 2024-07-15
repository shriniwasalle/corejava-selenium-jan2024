package org.alpha.sanjeevani.testngconcepts;
import org.testng.annotations.Test;
public class TestGroup2 {
    @Test(groups = {"regression","database-test"})
    public void testGroup4(){
        System.out.println("I am in testGroup14 method :: TestGroup2 :: with regression database-test");
    }
    @Test(groups = "database-test")
    public void testGroup5(){
        System.out.println("I am in testGroup5 method :: TestGroup2 :: with database-test");
    }
    @Test(groups = "database-testing")
    public void testGroup6(){
        System.out.println("I am in testGroup6 method :: TestGroup2 :: with database-testing ");
    }

}
