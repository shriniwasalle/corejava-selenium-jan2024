package org.alpha.sanjeevani.stringconcept;

public class TestStringMethod {
    public static void main(String[] args) {

        String name="Sanjeevani";
        //{0='S',1='a',2='n',3='j',4='e',5='e',6='v',7='a',8='n',9='i'}

        System.out.println("length of name is :"+name.length());
        System.out.println("toUpperCase is :"+name.toUpperCase());
        System.out.println("toUpperCase is :"+name.toLowerCase());

        String str1="Sanju";
        String str2="Sanju";
        String str3="sanju";
        String str4="  Automation    ";

        System.out.println("equals of string is :"+str1.equals(str2));
        System.out.println("equalsIgnoreCase is :"+str1.equalsIgnoreCase(str3));

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(6));
        System.out.println("replace :"+name.replace('n','I'));
        System.out.println("replace :"+name.replace("San","SAN"));

        System.out.println("replaceFirst :"+name.replaceFirst("e","E"));
        System.out.println("concat :"+name.concat("Sutar"));

        System.out.println("startsWith  "+name.startsWith("san"));
        System.out.println("endsWith :"+name.endsWith("ani"));
        System.out.println("trim : "+str4.trim());

        System.out.println("substring :"+name.substring(0,3));
        System.out.println("substring :"+name.substring(6,9));
        System.out.println(name.substring(6));

        char[]chArr =name.toCharArray();////{'S','a','n','j','e','e','v','a','n','i'}
        System.out.println(chArr);

        //using for loop

        for (int i=0;i<=name.length()-1;i++) {
            System.out.println(chArr[i]);
        }
//using for each loop
            for(char ch:chArr){
                System.out.print(ch);}

        }
    }

