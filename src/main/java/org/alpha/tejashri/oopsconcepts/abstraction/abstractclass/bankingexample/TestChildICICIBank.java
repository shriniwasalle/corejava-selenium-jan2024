package org.alpha.tejashri.oopsconcepts.abstraction.abstractclass.bankingexample;

public class TestChildICICIBank extends TestParentClassRBI {
    public void type() {
        System.out.println("type method :: ICICI is Private Sector type Bank in India");
    }

    public void loan() {
        System.out.println("loan method :: ICICI Car Loan");

    }

    public void ROI() {
        System.out.println("RIO method :: Rate of Interest in ICICI Bank : 7.5%");
    }

    public static void main(String[] args) {
        TestParentClassRBI obj = new TestChildICICIBank();
        obj.saving();
        obj.current();
        obj.type();
        obj.loan();
        obj.ROI();
    }
}

//----------Output---------
//In TestParentClassRBI :: Saving Account Department
//In TestParentClassRBI :: Current Account Department
//type method :: ICICI is Private Sector type Bank in India
//loan method :: ICICI Car Loan
//RIO method :: Rate of Interest in ICICI Bank : 7.5%