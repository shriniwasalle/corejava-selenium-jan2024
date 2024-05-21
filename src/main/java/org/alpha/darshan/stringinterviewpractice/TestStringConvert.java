package org.alpha.darshan.stringinterviewpractice;

public class TestStringConvert {


    // Replace the character 'O' with 't' from 2nd word i.e World
    public void convertStringtoInt(){
        String input="Hello world";
        String [] words= input.split(" ");//split the given string so that each word should be treat as an individual string
        String newWord= words[1].replace('o','t');//use replace mothod to replace the old chr into new char
        System.out.println(words[0]+" "+newWord);
    }

    public static void main(String[] args) {
        TestStringConvert conv= new TestStringConvert();
        conv.convertStringtoInt();
    }
}
