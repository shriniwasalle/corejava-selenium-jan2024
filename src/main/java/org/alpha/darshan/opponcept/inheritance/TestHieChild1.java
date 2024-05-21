package org.alpha.darshan.opponcept.inheritance;

public class TestHieChild1 extends TestHieParent{

    public void getdetails(){
        System.out.println(age);
        System.out.println("i am in test child hie");
        super.getDetails();
    }


    public static void main(String[] args) {
        TestHieChild1 tc1= new TestHieChild1();
        tc1.getdetails();
        tc1.getdetails();
    }
}
