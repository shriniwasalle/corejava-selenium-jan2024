package org.alpha.sanjeevani.practice;

public class RemoveSpacesOfString {
    public static void main(String[] args) {
        String name="S a njee va  ni";
        String name1=name.replaceAll("\\s","");
        System.out.println(name1);
    }
}
