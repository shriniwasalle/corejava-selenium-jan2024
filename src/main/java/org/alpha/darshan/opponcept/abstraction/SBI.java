package org.alpha.darshan.opponcept.abstraction;

public class SBI extends Bank{
    @Override
    public int getRateOfInterest() {
        return 8;
    }

    public static void main(String[] args) {
        Bank b2= new SBI();
        int rateOfintsbi= b2.getRateOfInterest();
        System.out.println(rateOfintsbi);
    }
}
