package org.alpha.darshan.stringinterviewpractice;

public class ReplaceExample1 {
    public static void main(String[] args) {
        String str= "oooooo-hhhh-oooooo";
        String rs=str.replace('h','s');
        System.out.println(rs);
        String rs1= str.replace('o','a');
        System.out.println(rs1);
    }
}
