package org.alpha.sanjeevani.onlycorejavaconcepts.oopsconcepts.abstraction.abstractclass;

public class TestBankOfIndia extends TestBank{
    public void rateOfInterestOfGoldLoan(){
        System.out.println("Rate of interest of bank of india for gold loan is: 7.8%");
    }
    public void homeLoan(){
        System.out.println("Rate of interest of bank of india for HomeLoan is: 7.9%");
    }
    public void carLoan(){
        System.out.println("Rate of interest of bank of india for carLoan is: 9.5%");
    }
    public static void main(String[] args) {
        TestBank obj= new TestBankOfIndia();
        obj.rateOfInterestOfGoldLoan();
        obj.homeLoan();
        obj.carLoan();
    }
}
