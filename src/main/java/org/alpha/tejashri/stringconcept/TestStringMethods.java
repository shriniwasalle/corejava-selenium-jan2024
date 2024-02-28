package org.alpha.tejashri.stringconcept;

public class TestStringMethods {


    public static void main(String[] args) {
        String name = "Tejashri";
        //{ 0=T, 1=e, 2=j, 3=a, 4=s, 5=h, 6=r, 7=i }

        System.out.println("Name : " + name.length()); // 8
        System.out.println("toUpperCase : " + name.toUpperCase()); //TEJASHRI
        System.out.println("toLowerCase : " + name.toLowerCase()); //tejashri

        String str1 = "Shri";
        String str2 = "Shri";
        String str3 = "shri";
        String str4 = "     Automation     ";

        System.out.println("Equals : " + str1.equals(str2)); //true
        System.out.println("Equals : " + str1.equals(str3)); //false, Shri not = to shri
        System.out.println("equalsIgnoreCase : " + str1.equalsIgnoreCase(str3)); //it ignores the upper oo lower case not the character

        System.out.println("charAt 7 : " + name.charAt(7)); // i
        System.out.println("charAt 0 : " + name.charAt(0)); // T

        System.out.println("replace  : " + name.replace('T', 'R')); //Rejashri
        System.out.println("replace  : " + name.replace('a', 'E')); //TejEshri
        System.out.println("replace  : " + name.replace("Teja", "Raja")); //Rajashri

        String name1 = "Tejishri";
        System.out.println("replaceFirst  : " + name1.replaceFirst("i", "A")); //TejAshri


        System.out.println("concat : " + name.concat("Boppa")); //TejashriBoppa
        System.out.println("startsWith : " + name.startsWith("Teja")); //true
        System.out.println("startsWith : " + name.startsWith("shri")); //false
        System.out.println("endsWith : " + name.endsWith("shri")); //true
        System.out.println("endsWith : " + name.endsWith("Shri")); //false
        System.out.println("without trim : " + str4); //      Automation
        System.out.println("trim : " + str4.trim()); //Automation

        System.out.println("substring : " + name.substring(0, 5)); //Tejas---> begin index 0 to before endindex 5-1=4
        System.out.println("substring : " + name.substring(2, 8)); //jashri---> begin index 2 to before endindex 8-1=7
        System.out.println("substring : " + name.substring(3, 6)); //ash---> begin index 3 to before end index 6-1=5
        System.out.println("substring : " + name.substring(4)); //shri--> only begin index prints begin index 4 to upto end index 7

        char[] char1 = name.toCharArray();
        System.out.println(char1); //Tejashri

        String sss = "Mahi";
        char[] char2 = sss.toCharArray();
        System.out.println(char2);//Mahi
        System.out.println(sss);//Mahi


        System.out.println(char1[0]);
        System.out.println(char1[1]);
        System.out.println(char1[2]);
        System.out.println(char1[3]);
        System.out.println(char1[4]);

        System.out.println("-----------------");
        for (int i = 0; i <= 3; i++) {
            System.out.println(char2[i]);
        }
        System.out.println("-------Using For Loop----------");
        // to make it Dynamic way for loop
        for (int i = 0; i <= char1.length - 1; i++) {
            System.out.println(char1[i]);
        }

        System.out.println("------Using For Each Loop----------");
        for (char ch : char1) {
            System.out.println(ch);
        }

        String str5 = "Tejashri Automation Testing";
        String[] strArr = str5.split(" "); // ["Tejashri","Automation","Testing"]
        System.out.println("Length after Slit: " + strArr.length); //3
        System.out.println(strArr); // it gives memory location

        for (String str : strArr) {
            System.out.println(str);
        }

        String str6 = "Tejashri      Automation Testing"; // total 6 spaces given
        String[] strArr1 = str6.split(" "); //1 space is for split remaining 5 spaces, single space considered as a string means 5
        System.out.println("Length after Slits with multiple spaces :" + strArr1.length); //8 --->5+3=8

        String[] strArr2 = str6.split("\\s+"); // \\s+ with this multiple spaces considered single space
        System.out.println("Length after split with multiple spaces considered single space : " + strArr2.length);

        String str7 = "Tejashri Automation Testing, xyz, abc, 123";
        String[] strArr3 = str7.split(",");
        System.out.println("Length after split with , : " + strArr3.length);

        int index = name.indexOf('T');
        System.out.println("indexOf :" + index);

        int indexword = name.indexOf("shri");
        System.out.println("indexOf :" + indexword);

        String name2 = "Tejeshreejsabcs";

        int lastindex = name2.lastIndexOf('e');
        System.out.println("Last indexOf :" + lastindex);//8

        System.out.println("IndexOf middle e : " + name2.indexOf('e', 2)); //3
        System.out.println("IndexOf middle j : " + name2.indexOf('s', 9)); //10

        System.out.println("Contains : " + name.contains(str3)); //true--> shri contains
        System.out.println("Contains : " + name.contains(sss)); //false--> Mahi not contains

        System.out.println("is this name string empty : " + name.isEmpty());// false

        String s1 = "";
        System.out.println("is this name string empty : " + s1.isEmpty());// true bcoz string is blank or empty

    }
}

// Output:
//Name : 8
//toUpperCase : TEJASHRI
//toLowerCase : tejashri
//Equals : true
//Equals : false
//equalsIgnoreCase : true
//charAt 7 : i
//charAt 0 : T
//replace  : Rejashri
//replace  : TejEshri
//replace  : Rajashri
//replaceFirst  : TejAshri
//concat : TejashriBoppa
//startsWith : true
//startsWith : false
//endsWith : true
//endsWith : false
//withouttrim :      Automation
//trim : Automation
//substring : Tejas
//substring : jashri
//substring : ash
//substring : shri
//Tejashri
//Mahi
//Mahi
//T
//e
//j
//a
//s
//-----------------
//M
//a
//h
//i
//-------Using For Loop----------
//T
//e
//j
//a
//s
//h
//r
//i
//------Using For Each Loop----------
//T
//e
//j
//a
//s
//h
//r
//i
//Length after Slit: 3
//[Ljava.lang.String;@4e04a765
//Tejashri
//Automation
//Testing
//Length after Slits with multiple spaces :8
//Length after split with multiple spaces considered single space : 3
//Length after split with , : 4
//indexOf :0
//indexOf :4
//Last indexOf :8
//IndexOf middle e : 3
//IndexOf middle j : 10
//Contains : true
//Contains : false
//is this name string empty : false
//is this name string empty : true