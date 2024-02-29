package org.alpha.darshan.stringpractice;

public class TestPracticeString1 {


    public static void main(String[] args) {

        //by object way
        String s1= new String("darshan");
        //whenever we create a string by using object way there will be two obj
        //created one in heap memory and one in string constant pole
        //SCP does not allowed duplicate values.
        //heap memory allows duplicate values.

        //by string literal

        String s2= "gaikwad";

        // when we create string object by string literal way then values directly stored in SCP
        //ONLY one object created.

        String s3="gaikwad";

        //if we created onther object but value of that object matched with previous object
        //then thr is no any new object will get creat bcz value is already present in SCP.
        //S3 directly refers to that value.

        String s4= new String("darshan");

        //here only one object will get created bcz at SCP the value of darshan is already present
        //then by condition of SCP there is no any dublicate values allowed

        //difference between == and equals()

        //== : address comparison

        System.out.println(s4==s1);
        System.out.println(s3==s2);

        //value comparison

        System.out.println(s4.equals(s1));
        System.out.println(s3.equals(s2));

    }
}
