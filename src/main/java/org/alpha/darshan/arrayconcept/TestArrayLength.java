package org.alpha.darshan.arrayconcept;



public class TestArrayLength {

    public void testLength(){
        String [] carS={"VOLVO","MAHINDRA","MARUTI"};
        System.out.println(carS.length);
        System.out.println(carS[2]);
    }

    public static void main(String[] args) {
        TestArrayLength L1= new TestArrayLength();
            L1.testLength();
    }
}
