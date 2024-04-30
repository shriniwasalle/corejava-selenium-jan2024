package org.alpha.akash.stringconcepts;

public class StringReverse {
    public static void main(String[] args) {
        String str ="Akash";

        str.charAt(4);//h
        str.charAt(3);//s
        str.charAt(2);//a
        str.charAt(1);//k
        str.charAt(0);//A


        //o/p : hsakA

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());



        StringBuffer sbf = new StringBuffer(str);
        System.out.println(sbf.reverse());



        char [] chArry = str.toCharArray();
        System.out.println(chArry.length);//5

        System.out.println(chArry[4]);
        System.out.println(chArry[3]);
        System.out.println(chArry[2]);
        System.out.println(chArry[1]);
        System.out.println(chArry[0]);

        //Using to char array
        for (int i = chArry.length-1; i >=0 ; i--) {

            System.out.println(chArry[i]);

        }
        //using CharAt()
        String name1 = "My Name Is Akash";

        for (int i = name1.length()-1; i >=0 ; i--) {

            System.out.println(name1.charAt(i));

        }//yM emaN sI hsakA



    }
}
