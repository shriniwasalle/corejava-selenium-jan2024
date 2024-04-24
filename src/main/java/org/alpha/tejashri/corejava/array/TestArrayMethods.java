package org.alpha.tejashri.corejava.array;

import java.util.Arrays;

public class TestArrayMethods {

    public static void main(String[] args) {
        System.out.println("------------Array String set Example 1--------------");
        String[] cars1 = {"Volvo", "BMW", "Tesla"};
        String[] cars2 = {"Volvo", "BMW", "Tesla"};

        //length property is a built-in Java property, and does not belong to the Arrays class.
        System.out.println("Length of cars2 array : " + cars2.length);

        /*1. compare() method compares two arrays lexicographically.
            ->Returns 0 if the arrays are equal.
            ->Returns a negative integer if the array1 is less than array2 lexicographically.
            ->Returns a positive integer if array1 is greater than array2 lexicographically.*/

        System.out.println("Comparing to arrays : " + Arrays.compare(cars1, cars2));//0
        System.out.println();

        /*2. equals() method checks whether two arrays are equal.
        Two arrays are considered equal if they share the same elements in the same order.
        -->Returns true if the arrays are equal.
        -->Returns false if the arrays are not equal.*/
        System.out.println("Two arrays are equal or not : " + Arrays.equals(cars1, cars2));//true
        System.out.println();

        /*3. sort() method sorts an array in ascending order.
        This method sorts arrays of strings alphabetically, and arrays of integers numerically.*/
        System.out.println("Sorting the array String Alphabetically : ");
        Arrays.sort(cars1);
        for (String str : cars1) {
            System.out.println(str);
        }
        System.out.println();

        /*4. fill() method fills an array with a specified value.
        The value must be of the same data type as the array.
        Start and end position can be specified. If not, all elements will be filled.*/
        System.out.println("Filling/Adding the value in the array at required position");
        Arrays.fill(cars1, 2, 3, "i10");
        for (String str : cars1) {
            System.out.println(str);
        }
        System.out.println();

        System.out.println("------------Array Integer set Example 2--------------");
        int[] num1 = {1, 5, 3, 4, 2};
        int[] num2 = {6, 8, 7, 9, 0};

        System.out.println("Comparing to arrays : " + Arrays.compare(num1, num2));//-1

        System.out.println("Two arrays are equal or not : " + Arrays.equals(num1, num2));//false

        System.out.println("Sorting the array integers numerically using for each loop ");
        Arrays.sort(num2);
        for (int num : num2) {
            System.out.println(num);
        }

        System.out.println("Sorting the array integers numerically using for loop ");
        Arrays.sort(num1);
        for (int i = 0; i < num1.length; i++) {
            System.out.println(i);
        }

        System.out.println("Filling/Adding the value in the array at required position");
        Arrays.fill(num2, 2, 4, 100);
        for (int i : num2) {
            System.out.println(i);
        }
    }
}




