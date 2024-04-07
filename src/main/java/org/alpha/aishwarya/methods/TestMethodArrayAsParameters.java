package org.alpha.aishwarya.methods;

public class TestMethodArrayAsParameters {

    int aa= 20; // instance variable

    public void m1 (String [] str){
        int aa = 10;   // local variable
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
        System.out.println(aa);
        System.out.println(this.aa);
       // System.out.println(super.aa);

    }

    public static void main(String[] args) {

        String[] str = {"Candy", "Saga", "Ram"}; // 0 , 1, 2

        TestMethodArrayAsParameters obj = new TestMethodArrayAsParameters();
        obj.m1(str);

    }
}
