package org.alpha.sanjeevani.onlycorejavaconcepts.instanceblock;

public class TestInstanceBlock {
    {
        System.out.println("I am in static block1");
    }
    {
        System.out.println("I am in static block2");
    }
    public TestInstanceBlock(){
        System.out.println("I am in no-args constructor ");
    }

    public static void main(String[] args) {
        TestInstanceBlock obj=new TestInstanceBlock();
        System.out.println("                         ");
        TestInstanceBlock obj1=new TestInstanceBlock();
    }
}
