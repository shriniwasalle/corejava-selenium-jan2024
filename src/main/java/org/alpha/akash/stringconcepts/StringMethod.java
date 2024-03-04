package org.alpha.akash.stringconcepts;

import java.io.PrintStream;

public class StringMethod {

    public static void main(String[] args) {

        String name = "Akash";//{0:A, 1:k, 2:a, 3:s ,4:h}

        System.out.println("Name Length is :" +name.length());
        System.out.println("Name toUpperCase :" +name.toUpperCase());
        System.out.println("Name toLowerCase :" +name.toLowerCase());

        String s1 ="Akki";
        String s2 = "akki";
        String s3 = "Akki";
        String s4 =" Automation ";


        System.out.println(s1 .equals(s2)); //false
        System.out.println(s1 .equals(s3)); //true
        System.out.println(s1 .equalsIgnoreCase(s2)); //true

        System.out.println("Charector of 5 possiton: "+ name.charAt(4));
        System.out.println("Charector of 1 possiton: "+ name.charAt(0));


        System.out.println("Replace: "+ name.replace('A','a'));
        System.out.println("Replace: "+ name.replace("kash","KASH"));
        System.out.println("Replace Only First Letter : "+s2.replaceFirst("k","a"));


        System.out.println("Concate :" + name.concat("Vaitala"));

        //boolean
        System.out.println("StartWith :" +name.startsWith("Aka"));
        System.out.println("endWith :" +name.endsWith("sh"));

        System.out.println("trim :"+ s4.trim());


        System.out.println("substring:" +name.substring(0 , 2));
        System.out.println("substring:" +name.substring(2 , 5));
        System.out.println("substring:" +name.substring(4));
        System.out.println("substring:" +name.substring(0 , 5));


        char[] chArray = name.toCharArray(); //Akash ={'A','k','a','s','h',}

        System.out.println(chArray);
        System.out.println(chArray[0]);
        System.out.println(chArray[1]);
        System.out.println(chArray[2]);

        System.out.println("For loop");
        for(int i = 0;i <= chArray.length-1;i++) {
            System.out.println(chArray[i]);
        }
        System.out.println("For Each loop");
        for( char ch :chArray) {
            System.out.println(ch);
        }



        String s5 ="Akash     Deepak Vaitala";
        String [] sArray = s5.split("\\s+");
        System.out.println("Length after split space :"+sArray.length);

        String s6 ="Akash     Deepak Vaitala";
        String [] s6Array = s6.split(" ");
        System.out.println("Length after split space :"+s6Array.length);



        int index = name.indexOf('s');
        int indexWord = name.indexOf("kash");

        String name1 = "AKKI";
        System.out.println(name1.indexOf('A')); //0
        System.out.println(name1.indexOf('K',2)); //2



        int indexLast = name1.indexOf(('K'));
        System.out.println("IndexOf :" +index);
        System.out.println("word IndexOf :" +indexWord);
        System.out.println("Last Index :" +indexLast);

        String  name2 = "AKASH";
        int nm = name2.lastIndexOf('k',1);
        System.out.println(nm);


        String name3 = "akash";
        String  name4 = "ash";

        System.out.println("Contains :"+name3.contains(name4));// true
        System.out.println("I s Blank :"+name.isBlank());// false










    }
}
