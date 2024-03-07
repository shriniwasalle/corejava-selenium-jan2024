package org.alpha.tejashri.oopsconcepts.abstraction.abstractclass.bankingexample;

public class TestChildBoABank extends TestParentClassRBI {
    public void type() {
        System.out.println("type method :: BoA is Foreign Bank type in India");
    }

    public void loan() {
        System.out.println("loan method :: BoA Personal Loan");

    }

    public void ROI() {
        System.out.println("RIO method :: Rate of Interest in BoA Bank : 6%");
    }

    public static void main(String[] args) {
        TestParentClassRBI obj = new TestChildBoABank();
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
//type method :: BoA is Foreign Bank type in India
//loan method :: BoA Personal Loan
//RIO method :: Rate of Interest in BoA Bank : 6%