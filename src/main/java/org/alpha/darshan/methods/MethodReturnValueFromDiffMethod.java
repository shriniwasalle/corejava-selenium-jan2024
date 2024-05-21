package org.alpha.darshan.methods;

public class MethodReturnValueFromDiffMethod {

    public String getName(){
        String name= "darshan";
        name= name+"Gaikwad";
        return name;
    }

    public int getDetails(){
        String name=getName();
        return name.length();
    }

    public static void main(String[] args) {
        MethodReturnValueFromDiffMethod t1= new MethodReturnValueFromDiffMethod();
        int len=t1.getDetails();
        System.out.println(len);
    }
}
