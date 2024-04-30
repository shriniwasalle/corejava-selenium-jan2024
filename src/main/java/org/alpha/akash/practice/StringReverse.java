package org.alpha.akash.practice;

import java.util.ArrayList;
import java.util.List;

public class StringReverse {

    public static void main(String[] args) {
        String str = "Akash";

        //Using StringBuilder
        StringBuilder  str1 = new StringBuilder(str);
        System.out.println(str1.reverse());

        //using StringBuffer
        StringBuffer str2 = new StringBuffer(str);
        System.out.println(str2.reverse());

        //Using ToCharArray
        char [] strchar = str.toCharArray();
        for (int i =strchar.length-1; i>=0; i--) {
            System.out.print(strchar[i]);
        }

        //Using CharAt() function
        for (int i= str.length()-1; i>=0;i--) {
            System.out.println(str.charAt(i));
        }

        //Using Collection
        //Confused code
//        char ch1[] = str.toCharArray();
//        List<Character> list = new ArrayList<Character>();
//        for(char ch: ch1) {
//            list.add(ch);
//        }
//        Collections.reverse(list);
//        ListIterator<Character> listIt = list.listIterator();
//        System.out.println("-- Using ListIterator --");
//        while (listIt.hasNext()) {
//            System.out.print(listIt.next());
//        }




    }
}
