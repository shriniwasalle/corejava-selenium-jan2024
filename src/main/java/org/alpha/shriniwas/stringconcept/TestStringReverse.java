package org.alpha.shriniwas.stringconcept;

public class TestStringReverse {

    public static void main(String[] args) {
        String str = "Shriniwas";

        str.charAt(8); // s
        str.charAt(7); // a
        str.charAt(6); // w
        str.charAt(5);
        str.charAt(4);
        str.charAt(3);
        str.charAt(2);
        str.charAt(1);
        str.charAt(0); // S


        // o/p : sawinirhS

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

        StringBuffer sbf = new StringBuffer(str);
        System.out.println(sbf.reverse());

        char [] chArr = str.toCharArray();
        // [S, h, r, i, n, i, w, a, s]
        System.out.println(chArr.length); // 9 - 1

        System.out.println(chArr[8]);
        System.out.println(chArr[7]);
        System.out.println(chArr[6]);
        System.out.println(chArr[5]);
        System.out.println(chArr[4]);
        System.out.println(chArr[3]);
        System.out.println(chArr[2]);
        System.out.println(chArr[1]);
        System.out.println(chArr[0]);

        System.out.println("---- Using toCharArray() ---- ");
        for (int i = chArr.length - 1 ; i>=0; i--) {
            System.out.print(chArr[i]);
        }

        System.out.println();
        System.out.println("---- Using charAt() ---- ");
        for (int i = str.length()-1 ; i>=0; i--) {
            System.out.print(str.charAt(i)); // s, a
        }

        // "My name is Shriniwas";
        // "yM eman si sawinirhS"
    }
}
