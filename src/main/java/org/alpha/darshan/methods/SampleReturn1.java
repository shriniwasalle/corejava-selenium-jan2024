package org.alpha.darshan.methods;

public class SampleReturn1 {

    public  int CompareNumber(){
        int x=10;
        int y=20;

        System.out.println("x="+x+"\ny="+y);

        if(x>y)
          return x;

          else
              return y;
        }
    public static void main(String[] args) {
        SampleReturn1 obj= new SampleReturn1();
        int result=obj.CompareNumber();
        System.out.println(result);
    }
}
