package org.alpha.practice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n, rem, sum = 0, c = 0;
        System.out.println("Enter any number");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        System.out.println("entered number is :" + n);
        c = n;

        while (n > 0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }
        if (c == sum) {
            System.out.println("number is Palindrome Number");
        } else {
            System.out.println("number is not Palindrome Number");
        }
    }
}
