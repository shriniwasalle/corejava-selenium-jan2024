package org.alpha.shriniwas.stringconcept;

public class TestStringMethods {

    public static void main(String[] args) {
        String name = "Shriniwas";

        // { 0='S', 1='h', 2='r', 3='i', 4='n', 5='i', 6='w' , 7='a', 8='s'}
        System.out.println("Length : " + name.length());
        System.out.println("toUpperCase : " + name.toUpperCase());
        System.out.println("toLowerCase : " + name.toLowerCase());

        String str1 = "Shri";
        String str2 = "Shri";
        String str3 = "shri";
        String str4 = "     Automation     ";

        System.out.println("Equals : " + str1.equals(str2));
        System.out.println("equalsIgnoreCase : " + str1.equalsIgnoreCase(str3));

        System.out.println("charAt 0: " + name.charAt(0));
        System.out.println("charAt 7: " + name.charAt(7));

        System.out.println("replace : " + name.replace('i', 'N'));
        System.out.println("replace : " + name.replace("was", "WAS"));
        System.out.println("replaceFirst : " + name.replaceFirst("i", "I"));

        System.out.println("concat : " + name.concat("Alle"));

        System.out.println("StartsWith : " + name.startsWith("Shri"));
        System.out.println("EndsWith : " + name.endsWith("was"));

        System.out.println("trim : " + str4.trim());

        System.out.println("substring : " + name.substring(0, 4));
        System.out.println("substring : " + name.substring(6, 9));
        System.out.println("substring : " + name.substring(6));
        System.out.println("substring : " + name.substring(2, 6));

        char[] chArr = name.toCharArray(); // Shriniwas = ['S', 'h', 'r', 'i', 'n', 'i', 'w', 'a', 's']

        System.out.println(chArr);

        System.out.println(chArr[0]);
        System.out.println(chArr[1]);
        System.out.println(chArr[2]);

        for (int i = 0; i <= chArr.length - 1; i++) {
            System.out.println(chArr[i]);
        }

        System.out.println("--- Using For Each Loop ---");
        for (char ch : chArr) {
            System.out.println(ch);
        }

        String str5 = "Shriniwas Automation Testing";
        String [] strArr = str5.split(" "); // ["Shriniwas", "Automation", "Testing"]
        System.out.println("Length after Split: " +strArr.length);

        for (String str : strArr) {
            System.out.println(str);
        }

        String str6 = "Shriniwas        Automation Testing";
        String [] strArr6 = str6.split("\\s+");
        System.out.println("Length after Split multiple spaces: " + strArr6.length);

        int index = name.indexOf('i');
        int indexWord = name.indexOf("was");

        String name1 = "shrinsiwasaac";

        System.out.println(name1.indexOf('s')); // 0
        System.out.println(name1.indexOf('s', 4)); // 5

        int indexLast = name.lastIndexOf('i');
        System.out.println("IndexOf : " +index);
        System.out.println("IndexOf : " +indexWord);
        System.out.println("lastIndex : " +indexLast);

        String name2 = "shriniwas";
        int nm = name2.lastIndexOf('s', 1);
        System.out.println(nm);

        String name3 = "Shriniwas";
        String name4 = "was";

        System.out.println("Contains : " +name3.contains(name4));
        System.out.println("isBlank : " +name.isBlank());

    }
}
