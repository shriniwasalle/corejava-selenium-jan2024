package org.alpha.darshan.arrayconcept;

public class TestReturningArrayFromMethod {

    public int[] testArray(){

        int [] values={100,200,300,400};

        return values;
    }

    public static void main(String[] args) {
        TestReturningArrayFromMethod r1= new TestReturningArrayFromMethod();
       int [] arr= r1.testArray();

       for(int i=0; i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
}
