package org.alpha.sanjeevani.onlycorejavaconcepts.staticblock;

public class TestStaticBlock {
    static {
        System.out.println("I am in static block1");
    }
    static {
        System.out.println("I am in static block2");
    }
    {
        System.out.println(" I am in instance-block");
    }
    TestStaticBlock(){
        System.out.println("I am in no-args constructor");
    }
    public static void main(String[] args) {
        TestStaticBlock obj=new TestStaticBlock();
        System.out.println("                 ");
        TestStaticBlock obj1=new TestStaticBlock();
        System.out.println("                 ");
        TestStaticBlock obj3=new TestStaticBlock();
    }
}
