package org.alpha.tejashri.corejava.oopsconcepts.abstraction.abstractclass.vehiclesexample;

public class TestChildAbstractClassBike extends TestParentAbstractClassVehicles {
    @Override
    public void wheels() {

        System.out.println("wheels in Bikes :: 2 Wheels");
    }

    @Override
    protected void suspension() {

        System.out.println("suspension in Bikes :: Mono suspension");
    }

    @Override
    protected void speed() { // Access Specifier changed from default->protected
        System.out.println("Speed in Bikes :: 120km/h");
    }

    public static void main(String[] args) {
        TestParentAbstractClassVehicles obj = new TestChildAbstractClassBike();
        obj.wheels();
        obj.suspension();
        obj.speed();
        obj.fuel(); //default method can access in same package not outside the package
        //obj.m1();// m1 is private method in parent class not access in other class

        TestParentAbstractClassVehicles.breaks();
    }
}

//--------Output----------
//wheels in Bikes :: 2 Wheels
//suspension in Bikes :: Mono suspension
//Speed in Bikes :: 120km/h
//Inside TestAbstractParentClassVehicle :: default fuel method
//Inside TestAbstractParentClassVehicle :: static breaks method