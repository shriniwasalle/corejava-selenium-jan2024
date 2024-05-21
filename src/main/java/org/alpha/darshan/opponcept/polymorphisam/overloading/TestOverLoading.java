package org.alpha.darshan.opponcept.polymorphisam.overloading;

public class TestOverLoading {

    public void add(int num1,int num2){

        int num= num1+num2;

        System.out.println(num);
    }

    public void add(int num1,int num2,int num3){
        int num= num1+num2+num3;
        System.out.println(num);
    }

    public static void main(String[] args) {
        TestOverLoading L1= new TestOverLoading();
        L1.add(100,200);
        L1.add(100,200,300);
    }
}
