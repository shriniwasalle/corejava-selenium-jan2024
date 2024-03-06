package org.alpha.sanjeevani.oopsconcepts.abstraction.abstractclass;

public class TestBankOfBaroda extends TestBank {
    public void rateOfInterestOfGoldLoan(){
        System.out.println("Rate of interest of bank of baroda for gold loan is: 7.5%");
    }
    public void homeLoan(){
        System.out.println("Rate of interest of bank of baroda for HomeLoan is: 8.5%");
    }
    public void carLoan(){
        System.out.println("Rate of interest of bank of baroda for carLoan is: 9.5%");
    }
    public static void main(String[] args) {
        TestBank obj = new TestBankOfBaroda();
        obj.rateOfInterestOfGoldLoan();
        obj.homeLoan();
        obj.carLoan();
    }
}
