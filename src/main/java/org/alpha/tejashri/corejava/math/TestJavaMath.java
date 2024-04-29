package org.alpha.tejashri.corejava.math;

public class TestJavaMath {
    static int x = 100;
    static int y = 50;
    static int z = 64;
    static float a = -6.4f;

    public static void main(String[] args) {
        //Math.max(x,y) method can be used to find the highest value of x and y
        System.out.println("Highest value : " + Math.max(x, y));

        //Math.min(x,y) method can be used to find the lowest value of x and y
        System.out.println("Lowest value : " + Math.min(x, y));

        //Math.sqrt(z) method returns the square root of z
        System.out.println("Square Root of z : " + Math.sqrt(z));

        //Math.abs(a) method returns the absolute (positive) value of a
        System.out.println("Absolute (Positive) value of a : " + Math.abs(a));

        //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println("Random Number : " + Math.random());

        //Random Number between 0 and 100
        int randomNum = (int) (Math.random() * 101);  // 0 to 100
        System.out.println("Random Number between 0 and 100 : " + randomNum);

        //Random Number between 0 and 10
        int ranNum = (int) (Math.random() * 11);  // 0 to 10
        System.out.println("Random Number between 0 and 10 : " + ranNum);
    }
}
