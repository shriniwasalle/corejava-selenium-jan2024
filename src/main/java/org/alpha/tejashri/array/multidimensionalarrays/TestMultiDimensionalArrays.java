package org.alpha.tejashri.array.multidimensionalarrays;

public class TestMultiDimensionalArrays {

    public static void main(String[] args) {
        //Multi Dimensional Arrays
        int[][] ids = {{10, 20, 30}, {40, 50, 60, 70, 80}};
        //Access Array Values/Elements
        System.out.println("Accessing 1st Array values are");
        System.out.println(ids[0][0]); //in 1st array index 0 value will print = 10
        System.out.println(ids[0][1]); //20
        System.out.println(ids[0][2]); //30
        //System.out.println(ids[0][3]); //gives error -Index 3 out of bounds for length 3

        System.out.println();

        System.out.println("Accessing 2nd Array values are");
        System.out.println(ids[1][0]); //in 2nd array index 0 value will print = 40
        System.out.println(ids[1][1]); //50
        System.out.println(ids[1][2]); //60
        System.out.println(ids[1][3]); //70
        System.out.println(ids[1][4]); //80
        //System.out.println(ids[1][5]); //gives error -Index 5 out of bounds for length 5

        System.out.println();

        //Change Array Values /Element values
        System.out.println("Changing 1st Array values are");
        ids[0][2] = 90;
        System.out.println(ids[0][2]); //30 will replace by 90
        ids[0][1] = 100;
        System.out.println(ids[0][1]); // 20 will replace by 100

        System.out.println();

        System.out.println("Changing 2nd Array values are");
        ids[1][2] = 220;
        System.out.println(ids[1][2]); //60 will replace by 220
        ids[1][3] = 200;
        System.out.println(ids[1][3]); // 50 will replace by 200

        System.out.println();

        //Loop Through a Multi-Dimensional Array
        System.out.println("Loop Through a Multi-Dimensional Array");
        char [][] letters = {{'A','B','C'} , {'D','F','G'}};
        for (char i = 0; i < letters.length; ++i) {
            for(char j = 0; j < letters[i].length; ++j) {
                System.out.println(letters[i][j]);
            }
        }
    }
}
