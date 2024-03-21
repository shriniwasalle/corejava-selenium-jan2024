package org.alpha.practice.practice;

import java.util.Scanner;

public class PositiveNumberOrNot {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter any number");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        } else if (num<0) {
            System.out.println("Number is negative");

        } else {
            System.out.println("Number is not positive nor negative");
        }
    }
}
