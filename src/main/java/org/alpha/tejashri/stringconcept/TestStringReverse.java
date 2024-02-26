package org.alpha.tejashri.stringconcept;

public class TestStringReverse {

    public static void main(String[] args) {
        String str = "Tejashri";
        str.charAt(7);//i
        str.charAt(6);//r
        str.charAt(5);//h
        str.charAt(4);//s
        str.charAt(3);//a
        str.charAt(2);//j
        str.charAt(1);//e
        str.charAt(0);//T

        // o/p : irhsajeT
        System.out.println("---------1.Using StringBuilder---------------");
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

        System.out.println("---------2.Using StringBuffer---------------");
        StringBuffer sbf = new StringBuffer(str);
        System.out.println(sbf.reverse());

        char[] chArr = str.toCharArray();
        // [T, e, j, a, s, h, r, i]
        System.out.println("Length of Tejashri : " + chArr.length); //8

        System.out.println("---------3.Using toCharArray---------------");
        System.out.println(chArr[7]);
        System.out.println(chArr[6]);
        System.out.println(chArr[5]);
        System.out.println(chArr[4]);
        System.out.println(chArr[3]);
        System.out.println(chArr[2]);
        System.out.println(chArr[1]);
        System.out.println(chArr[0]);

        System.out.println("---------4.Using toCharArray with for loop---------------");
        for (int i = chArr.length - 1; i >= 0; i--) {
            System.out.print(chArr[i]);
        }
        System.out.println();// to print on next line
        System.out.println("---------5.Using charAt---------------");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}

//output
//---------1.Using StringBuilder---------------
//irhsajeT
//---------2.Using StringBuffer---------------
//irhsajeT
//Length of Tejashri : 8
//---------3.Using toCharArray---------------
//i
//r
//h
//s
//a
//j
//e
//T
//---------4.Using toCharArray with for loop---------------
//irhsajeT
//---------5.Using charAt---------------
//irhsajeT