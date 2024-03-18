package org.alpha.tejashri.methods;

public class TestMethodWithConditionalStatements {
    static void checkAge(int age1) {

        if (age1 < 18) {
            System.out.println("Not illegible for voting");
        } else {
            System.out.println("Illegible for voting");
        }
    }

    public void numbers(int num) {
        do {
            System.out.println(num);
            num++;
        }
        while (num <= 5);
    }

    public static void main(String[] args) {
        System.out.println("----With if else Statement----");
        checkAge(20);//static method can call directly without object creation
        checkAge(15);

        TestMethodWithConditionalStatements obj = new TestMethodWithConditionalStatements();
        System.out.println("----with Do while Statement----");
        obj.numbers(1);
    }
}