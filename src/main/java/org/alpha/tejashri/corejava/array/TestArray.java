package org.alpha.tejashri.corejava.array;

public class TestArray {
    public static void main(String[] args) {
        String[] days = {"Sun","Mon","Tue","Wen","Thu","Fri","Sat"};

        System.out.println("----Using for each loop---");
        for (String str : days){
            System.out.println(str);
        }

        System.out.println("----Using for loop---");
        for (int i=0; i<days.length; i++){
            System.out.println(days[i]);
        }
    }
}
