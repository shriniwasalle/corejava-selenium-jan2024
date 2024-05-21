package org.alpha.darshan.stringpractice;

public class LengthOfString {

    String name="Darshan";
    char [] strchrr=name.toCharArray();
    //toCharArray method
    public  void getLength(){

//        char [] strChar= name.toCharArray();//converted given string into char
        for (int i=(strchrr.length-1);i>=0;i--){
            System.out.println(strchrr[i]);
        }
        System.out.println("---------------------------");
    }

    //using charAt
    public  void getcharAt(){

        for(int i=0;i<=strchrr.length-1;i++){

            System.out.println(strchrr[i]);

        }
        System.out.println("---------------------------");

    }
    public void getCharat(){

        for (char ch:strchrr) {

            System.out.println(ch);

        }

    }
    public static void main(String[] args) {
        LengthOfString l1= new LengthOfString();
        l1.getLength();
        l1.getcharAt();
        l1.getCharat();
    }
}
