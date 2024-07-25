package org.alpha.sanjeevani.onlycorejavaconcepts.constructor;

public class TestChild extends TestChildParent {
    TestChild(){
        System.out.println("i am in child constructor");
    }
    public TestChild(int age){
        super("vedant");
        System.out.println(age);
    }
    public TestChild(String name,int age){
       this(500);
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
       TestChild obj=new TestChild();
        System.out.println("                          ");
        TestChild obj1=new TestChild(100);
        System.out.println("                          ");
        TestChild obj2=new TestChild("sanjana",300);

    }
}
