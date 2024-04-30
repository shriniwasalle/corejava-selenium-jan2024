package org.alpha.akash.practice;

public class CountWordSentence {
    public static void main(String[] args) {
        String str = "I am an Engineer";
        int count = 1;
        System.out.println(str);

        for(int i=0; i<(str.length()-1); i++) {
            if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
                count++;
            }
        }
        System.out.println("Inside of words :" +count);
    }
}
