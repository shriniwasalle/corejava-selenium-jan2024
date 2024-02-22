package org.alpha.darshan.custructors;

public class TestChild extends TestParent {

    public TestChild(){
        System.out.println("im in child method");
    }

    public TestChild(String name){
        System.out.println(name);

    }

    public static void main(String[] args) {
        TestChild t1=new TestChild();

        TestChild t2= new TestChild("DARSHAN");
    }
}
