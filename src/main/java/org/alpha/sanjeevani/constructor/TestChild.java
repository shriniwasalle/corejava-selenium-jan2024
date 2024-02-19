package org.alpha.sanjeevani.constructor;

public class TestChild extends TestChildParent {
    TestChild(){
        super("sanjeevani");
        System.out.println("i am in child constructor");
    }
    public static void main(String[] args) {
        TestChild obj=new TestChild();

    }
}
