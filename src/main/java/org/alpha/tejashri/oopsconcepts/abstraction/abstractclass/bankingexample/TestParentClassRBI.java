package org.alpha.tejashri.oopsconcepts.abstraction.abstractclass.bankingexample;

public abstract class TestParentClassRBI {
    //Abstract Methods
    public abstract void  ROI();

    public  abstract  void type();

    public abstract void loan();

    //Non-Abstract Methods
    public void saving(){
        System.out.println("In TestParentClassRBI :: Saving Account Department");
    }
    public static void current(){
        System.out.println("In TestParentClassRBI :: Current Account Department");
    }
}
