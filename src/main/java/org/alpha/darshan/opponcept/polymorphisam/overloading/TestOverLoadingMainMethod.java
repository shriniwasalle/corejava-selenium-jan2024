package org.alpha.darshan.opponcept.polymorphisam.overloading;

public class TestOverLoadingMainMethod {

    public static void m1(int[] intArr) {
        System.out.println(intArr);
    }

    public static void m1(String[] arr,int[] intArr) {
        System.out.println(arr);/*if we are not provinding which index location string we want to print then
                                it will give memory location*/
        System.out.println(intArr);
        System.out.println(arr [0]);/*if we are provinding which index location string we want to print then
                                it will give that location string*/
        System.out.println(intArr [0]);
    }

    public static void main(String[] args) {

        String [] strr={"darshan","gaikwad","automation"};
        int [] intArr={10,20,30};
        TestOverLoadingMainMethod.m1(strr,intArr);
    }
}
