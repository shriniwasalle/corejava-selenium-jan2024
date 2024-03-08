package org.alpha.tejashri.stringconcept;

public class TestStringReplacingCharactersStringsDigits {
    public static void main(String[] args) {
        // Replace the character
        String input = "Tejashri Mahika Anshika";
        String[] words = input.split(" ");

        // Replace the character 'i' with 'ee' from 1st word = Tejashri
        String newWord1 = words[0].replace("i", "ee");
        System.out.println(newWord1 + " " + words[1] + " " + words[2]);

        // Replace the character 'a' with 'i' from 2nd word = Mahika
        String newWord2 = words[1].replace("a", "i");
        System.out.println(words[0] + " " + newWord2 + " " + words[2]);

        // Replace the character 'A' with 'H' from 3rd word = Anshika
        String newWord3 = words[2].replace("A", "H");
        System.out.println(words[0] + " " + words[1] + " " + newWord3);

        // It will replace all non digits from String
        String s1 = "hello!@#%&*56789ThisIsA1234Sample";
        s1 = s1.replaceAll("\\D", ""); // \D matches any character that's not a digit (equivalent to [^0-9]), non-digits replaced to blank
        System.out.println("In String only Digits replace to blank : " + s1);

        // It will replace all digits from String
        String s2 = "hello!@#%&*56789ThisIsA1234Sample";
        s2 = s2.replaceAll("\\d", ""); // \d matches a digit (equivalent to [0-9]), digits replaced to blank
        System.out.println("In String only Non-digits replace to blank : " + s2);

        // It will replace all spaces to _
        String s3 = "hello 56789 This Is A 1234 Sample";
        s3 = s3.replaceFirst("\\s", "___"); // \s matches any whitespace character, spaces replaced to _
        System.out.println("In String only first space replace to --- : " + s3);

        // It will replace all non-spaces to *
        String s4 = "hello 56789 This Is A 1234 Sample";
        s4 = s4.replaceAll("\\S", "*"); // \S matches any non-whitespace character, non-spaces replaced to *
        System.out.println("In String only Non-space replace to * : " + s4);
    }
}

//----------Output---------
//Tejashree Mahika Anshika
//Tejashri Mihiki Anshika
//Tejashri Mahika Hnshika
//In String only Digits replace to blank : 567891234
//In String only Non-digits replace to blank : hello!@#%&*ThisIsASample
//In String only first space replace to --- : hello___56789 This Is A 1234 Sample
//In String only Non-space replace to * : ***** ***** **** ** * **** ******