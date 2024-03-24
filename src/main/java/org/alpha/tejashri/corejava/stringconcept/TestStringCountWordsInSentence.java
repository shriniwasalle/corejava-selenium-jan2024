package org.alpha.tejashri.corejava.stringconcept;

public class TestStringCountWordsInSentence {
    public static void main(String[] args) {
        String str = "Count the numbers of words in String";
        int count = 1;
        int length = str.length();

        for (int i = 0; i < (length - 1); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') //spaces not count in this
                count++;
        }

        System.out.println("Length of String : " + str.length()); //36 letters + 6 spaces = 42
        System.out.println("No of Words in a String/Sentence : " + count);
    }
}

//-------Output---------
//Length of String : 36
//No of Words in a String/Sentence : 7