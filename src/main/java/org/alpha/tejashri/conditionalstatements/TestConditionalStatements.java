package org.alpha.tejashri.conditionalstatements;

public class TestConditionalStatements {
    public static void main(String[] args) {
        //if Statement
        System.out.println("----Using if Statement-----");
        if (100 > 50) {
            System.out.println("100 is greater than 50 is true");
        }

        int x = 10, y = 20;
        if (x < y) {
            System.out.println("x is less than y is true");
        }

        //if - else Statement\
        System.out.println("----Using if - else Statement-----");
        if (x > y) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        //else - if Statement
        System.out.println("----Using else - if Statement-----");
        if (x > y) {
            System.out.println("Hello");
        } else if (x > 50) {
            System.out.println("Hello World");
        } else {
            System.out.println("Hello India");
        }

        //Ternary Operator or Short Hand if - else Statement
        System.out.println("--Using Ternary Operator or Short Hand if - else Statement--");
        String str = (x > y) ? "TRUE" : "FALSE";
        System.out.println(str);

        String str1 = (x != y) ? "Hello Mahika" : "Hello Anshika";
        System.out.println(str1);

        //Switch Statements
        System.out.println("----Using Switch Statement-----");
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend"); //if day value >7 then will execute this
        }
    }
}