package org.alpha.tejashri.oopsconcepts.abstraction.abstractclass.vehiclesexample;

public class TestChildAbstractClassCar extends TestParentAbstractClassVehicles {
    @Override
    public void wheels() {
        System.out.println("wheels in Cars :: 4 Wheels");
    }

    @Override
    protected void suspension() {
        System.out.println("suspension in cars :: Macpherson suspension");

    }

    @Override
    public void speed() { // Access Specifier changed from default->public
        System.out.println("Speed in Cars :: 200km/h");
    }

    public static void main(String[] args) {
        TestParentAbstractClassVehicles obj = new TestChildAbstractClassCar();
        obj.wheels();
        obj.suspension();
        obj.speed();
        obj.fuel(); //default method can access in same package not outside the package
        //obj.m1();// m1 is private method in parent class not access in other class

        TestParentAbstractClassVehicles.breaks();


    }
}

//--------Output----------
//wheels in Cars :: 4 Wheels
//suspension in cars :: Macpherson suspension
//Speed in Cars :: 200km/h
//Inside TestAbstractParentClassVehicle :: default fuel method
//Inside TestAbstractParentClassVehicle :: static breaks method