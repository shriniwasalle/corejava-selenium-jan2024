package org.alpha.sanjeevani.testngconcepts;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(TestListenerMethodsClass.class)
public class TestListener1 {
    //onStart->onTestStart->test1->onTestStart->test2........onTestStart->test4->onFinish
    @Test
    public void test1(){
        System.out.println("I am in test1::Listener1 class");
    }
    //if test2 is pass ,test3 will pass
    //if test2 is fail, test3 will ignore/skipped.
    @Test
    public void test2(){
        System.out.println("I am in test2::Listener1 class");
        //Assert.assertEquals("Test","Testing");
    }
    @Test(dependsOnMethods = "test2")
    public void test3(){
        System.out.println("I am in test3::Listener1 class");
    }
    @Test
    public void test4(){
        System.out.println("I am in test4::Listener1 class");
    }
}
