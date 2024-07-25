package org.alpha.sanjeevani.onlycorejavaconcepts.oopsconcepts.abstraction.abstractclass;

public class TestCar extends TestTataCar{
    public void nexon(){
        System.out.println("I am in nexon method");
    }
    public void altroz(){
        System.out.println("I am in altroz method");
    }
    public void tiago(){
        System.out.println("I am in tiago method");
    }
    public void harrier(){
        System.out.println("I am in harrier method");
    }
    public void punch(){
        System.out.println("I am in punch method");
    }
    public void safari(){
        System.out.println("I am in safari method");
    }
    public static void main(String[] args) {
        TestTataCar obj=new TestCar();
        obj.nexon();
        obj.altroz();
        obj.harrier();
        obj.punch();
        obj.safari();
    }
}
