package org.alpha.tejashri.stringconcept;

public class TestStringReverseEachWordInASentence {

    public static void main(String[] args) {

        String str = "My name is Tejashri";
        String[] words = str.split(" "); // Splits into 4 words
        String reverseStr = "";
        System.out.println("Words in String str or Length of words : " + words.length); // 4 words are in str string

        for (int i = 0; i < words.length; i++)
        {
            String singleWord = words[i];
            String reverseSingleWord = "";

            for (int j = (singleWord.length() - 1); j >= 0; j--) // single word length for 4 words is different
            {
                reverseSingleWord = reverseSingleWord + singleWord.charAt(j);
            }
            reverseStr = reverseStr + reverseSingleWord + " ";
        }
        System.out.println("Input String Sentence : " + str);
        System.out.println("Output String Sentence : " + reverseStr);
    }
}
