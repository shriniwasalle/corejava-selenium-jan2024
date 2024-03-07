package org.alpha.darshan.opponcept.inheritance;

public class TestHieChild2 extends TestHieParent{

    public void getDetails(){
        System.out.println(age);
        super.getDetails();
    }

    public static void main(String[] args) {
        TestHieChild2  tsc2= new TestHieChild2();
        tsc2.getDetails();
    }
}
