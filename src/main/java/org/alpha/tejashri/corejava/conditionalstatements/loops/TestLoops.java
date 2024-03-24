package org.alpha.tejashri.corejava.conditionalstatements.loops;

public class TestLoops {
    public static void main(String[] args) {
        // while loop
        System.out.println("--- Using while loop---");
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++; // without increment/decrement statement the loop with never ends
            // means continuously prints
        }

        System.out.println();

        int j = 5;
        while (j >= 0) {
            System.out.println(j);
            j--;
        }

        System.out.println();

        //Do While Loop
        System.out.println("--- Using do while loop---");
        int k = 0;
        do {
            System.out.println(k);
            k++; // without increment/decrement statement the loop with never ends
        }
        while (k != 6);

        System.out.println();

        // for loop
        System.out.println("--- Using for loop---");
        for (i = 0; i <= 5; i++)
            System.out.println(i);

        System.out.println();

        for (j = 5; j >= 0; j--)
            System.out.println(j);

        System.out.println();

        for (k = 0; k <= 10; k = k + 2) {
            System.out.println(k);
        }

        System.out.println();

        // Nested loops
        // Outer loop
        for (i = 0; i <= 2; i++) {
            System.out.println("Outer loop" + i);// Executes 2 times
            System.out.println();

            // Inner loop
            //The inner loop will be executed one time for each iteration of the outer loop
            for (j = 0; j <= 3; j++) {
                System.out.println("Inner loop" + j);// Executes 6 times (2 * 3)=6
            }
        }

        // for each loop
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec",};
        for (String x : month) {
            System.out.println("Months of the year : " +x);
        }
    }
}
