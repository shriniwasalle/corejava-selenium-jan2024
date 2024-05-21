package org.alpha.darshan.arrayconcept;



public class TestPrintAllElemetsLoop {

    public void testElements() {

        String[] carS = {"VOLVO", "MARUTI", "FORD", "MAHINDRA"};

        for (int i = 0; i < carS.length; i++) {
            System.out.println(carS[i]);


        }
        System.out.println("--------------------------");
        for (String cars : carS) {
            System.out.println(cars);
        }
    }

    public static void main(String[] args) {
        TestPrintAllElemetsLoop l1 = new TestPrintAllElemetsLoop();
        l1.testElements();
    }
}