package org.alpha.darshan.opponcept.inheritance;



public class TestChild extends TestParent {

    public void methodChild(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        TestChild t1= new TestChild();
        t1.methodChild();

    }
}
