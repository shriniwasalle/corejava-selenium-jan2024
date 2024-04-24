package org.alpha.tejashri.corejava.array;

public class TestArray {
    public static void main(String[] args) {
        String[] days = {"Sun", "Mon", "Tue", "Wen", "Thu", "Fri", "Sat"};
        System.out.println("Length of an array : " + days.length);
        System.out.println(days[0]);//Sun
        System.out.println(days[2]);//Tue
        System.out.println(days[6]);//Sat

        System.out.println("----Iterate the array Using for each loop----");
        for (String str : days) {
            System.out.println(str);
        }

        System.out.println("----Iterate the array Using for loop---");
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}
