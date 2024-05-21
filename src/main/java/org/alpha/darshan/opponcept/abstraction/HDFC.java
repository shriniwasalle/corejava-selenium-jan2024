package org.alpha.darshan.opponcept.abstraction;

public class HDFC extends Bank{
    @Override
    public int getRateOfInterest() {
        return 7;
    }

    public static void main(String[] args) {
        Bank b1= new HDFC();
        int hdfcint=b1.getRateOfInterest();
        System.out.println(hdfcint);
    }
}
