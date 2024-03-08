package org.alpha.practice;

import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {
        int number, rem, arm = 0, constant;
        System.out.println("Enter any number");
        Scanner obj = new Scanner(System.in);
        number = obj.nextInt();
        System.out.println("Entered number is:" + number);
        constant = number;
        while (number > 0) {
            rem = number % 10;
            arm = (rem * rem * rem) + arm;
            number = number / 10;
        }
        if (constant == arm) {
            System.out.println("number is ArmStrongNumber");
        } else {
            System.out.println("number is not ArmStrongNumber");
        }
    }
}
