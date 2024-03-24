package org.alpha.tejashri.corejava.oopsconcepts.abstraction.abstractclass.vehiclesexample;

public class TestChildAbstractClassAuto extends TestParentAbstractClassVehicles {
    @Override
    public void wheels() {
        System.out.println("wheels in Autos :: 3 Wheels");
    }

    @Override
    public void suspension() { // Access Specifier changed from protected->public

        System.out.println("suspension in Autos :: Active suspension");
    }

    @Override
    void speed() {
        System.out.println("Speed in Autos :: 100km/h");
    }

    public static void main(String[] args) {
        TestParentAbstractClassVehicles obj = new TestChildAbstractClassAuto();
        obj.wheels();
        obj.suspension();
        obj.speed();
        obj.fuel(); //default method can access in same package not outside the package
        //obj.m1();// m1 is private method in parent class not access in other class

        TestParentAbstractClassVehicles.breaks();
    }
}

//---------Output----------
//wheels in Autos :: 3 Wheels
//suspension in Autos :: Active suspension
//Speed in Autos :: 100km/h
//Inside TestAbstractParentClassVehicle :: default fuel method
//Inside TestAbstractParentClassVehicle :: static breaks method