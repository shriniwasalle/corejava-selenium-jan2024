package org.alpha.tejashri.conditionalstatements.BreakAndContinue;

public class TestBreakAndContinue {

    public static void main(String[] args) {

        // break continue in for loop
        System.out.println("--- break continue in for loop ---");
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println();

        for (int j = 5; j >= 0; j--) {
            if (j == 3) {
                continue;
            }
            System.out.println(j);
        }

        System.out.println();

        // break continue in while loop
        System.out.println("--- break continue in while loop ---");
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
            if (i == 3) {
                break;
            }
        }

        System.out.println();

        int j = 5;
        while (j >= 0) {
            System.out.println(j);
            j--;
            if (j == 3) {
                continue;
            }
        }
    }
}
