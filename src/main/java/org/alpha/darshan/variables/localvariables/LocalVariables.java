package org.alpha.darshan.variables.localvariables;

public class LocalVariables {

    public void m1(String str){

        System.out.println(str);
    }

    public static void m2(){
        int age=200;
        System.out.println(age);
    }
    public static void main(String[] args) {
        LocalVariables l1= new LocalVariables();
        l1.m1("darshan");
        LocalVariables.m2();
         byte b=125;

         int in=10221;

         float f= 10.2f;

         char ch='d';

         String [] names ={"darshan","gaikwad"};

         boolean [] flags={true,false,true};

        System.out.println(b);
        System.out.println(in);
        System.out.println(names);
        System.out.println(flags);

    }
}
