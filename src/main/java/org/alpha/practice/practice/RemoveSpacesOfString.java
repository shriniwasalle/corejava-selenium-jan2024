package org.alpha.practice.practice;

public class RemoveSpacesOfString {
    public static void main(String[] args) {
        String name="S       an jee  van  i";
        String name2=name.replaceAll("\\s","");
        System.out.println("after Removing Spaces Of String is :"+name2);
    }
}
