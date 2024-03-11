package org.alpha.tejashri.practices;

public class TestPrintingPatterns {
    public static void main(String[] args) {

        //1. With single for loop:

        String str1 = "@@@@@@";

        for (int i = str1.length(); i>=0; i--) {
            System.out.println(str1.substring(0, i));
        }
        System.out.flush();
        for (int j = 0; j <= str1.length(); j++){
            System.out.println(str1.substring(0,j));
        }
        System.out.println();

        //2. With 2 for loops:

        String str2 = "@@@@@@";
        char[] chArr = str2.toCharArray();

        for (int i=0; i <= (chArr.length -1); i++){
            for (int j=0; j <= i; j++) {
                System.out.print(chArr[j]);
            }
            System.out.println();
        }
        System.out.println();

    for (int i = (chArr.length-1); i>=0; i--){
        for (int j=0; j<=i; j++){
            System.out.print(chArr[j]);
        }
        System.out.println();
        }
    }
}
