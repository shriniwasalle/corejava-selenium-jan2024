package org.alpha.sanjeevani.testngconcepts;
import org.testng.annotations.Test;
public class TestDefaultSequence {
    @Test(priority = 1)
    public void a(){
        System.out.println("I am in a method");
    }
    @Test
    public void b(){
        System.out.println("I am in b method");
    }
    @Test(priority = -2)
    public void c(){
        System.out.println("I am in c method");
    }
    @Test(priority=-1)
    public void d(){
        System.out.println("I am in d method");
    }
}
