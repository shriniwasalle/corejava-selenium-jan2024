package org.alpha.darshan.arrayconcept;

public class TestToChangeValue {

    public void changeValue(){

        String [] cars={"volvo","BMW","Ford","Mahindra"};
        cars[0]="Maruti";
        System.out.println(cars[0]);
    }

    public static void main(String[] args) {
        TestToChangeValue T1= new TestToChangeValue();
        T1.changeValue();
    }
}
