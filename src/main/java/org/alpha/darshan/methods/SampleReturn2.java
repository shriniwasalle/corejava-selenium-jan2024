package org.alpha.darshan.methods;

public class SampleReturn2 {
    public int CompreNumber(int x,int y){
        System.out.println("X="+x+"\nY="+y);
        if (x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args) {
        SampleReturn2 obj2= new SampleReturn2();
        int result=obj2.CompreNumber(30,50);
        System.out.println(result);
    }
}
