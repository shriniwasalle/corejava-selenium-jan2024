package org.alpha.tejashri.oopsconcepts.abstraction.abstractclass.bankingexample;

public class TestChildSBIBank extends TestParentClassRBI {
    public void type() {
        System.out.println("type method :: SBI is Public Sector Bank type in India");
    }

    public void loan() {
        System.out.println("loan method :: SBI Home Loan");

    }

    public void ROI() {
        System.out.println("RIO method :: Rate of Interest in SBI Bank : 7%");
    }

    public static void main(String[] args) {
        //TestParentClassRBI obj = new TestParentClassRBI(); // can not create abstract class object

        //Runtime polymorphism concept
        TestParentClassRBI obj1 = new TestChildSBIBank(); //reference of abstract class to other class object
        obj1.saving(); //parent class saving method will call
        obj1.current();//parent class current method will call
        obj1.type();//child class type method will call
        obj1.loan();//child class loan method will call
        obj1.ROI();//child class RIO method will call
    }
}

//----------Output---------
//In TestParentClassRBI :: Saving Account Department
//In TestParentClassRBI :: Current Account Department
//type method :: SBI is Public Sector Bank type in India
//loan method :: SBI Home Loan
//RIO method :: Rate of Interest in SBI Bank : 7%