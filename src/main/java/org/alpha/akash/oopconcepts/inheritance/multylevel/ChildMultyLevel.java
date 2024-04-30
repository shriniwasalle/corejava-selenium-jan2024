package org.alpha.akash.oopconcepts.inheritance.multylevel;

public class ChildMultyLevel extends ParentMultyLevel {


    int age = 24;
    void getData(){
        System.out.println(age); //ChildMultyLevel : age 24
        System.out.println(id);  //ParentMultyLevel : id 20
        System.out.println(id1); //GrandParentMultyLevel : id1 101
        System.out.println(super.age); //ParentMultyLevel : age 50
    }

    public static void main(String[] args) {
        ChildMultyLevel obj = new ChildMultyLevel();
        obj.getData();

        ParentMultyLevel obj1 = new ParentMultyLevel();
        System.out.println(obj1.age); //ParentMultyLevel : age 50
        System.out.println(obj1.id); //ParentMultyLevel : id 50

        GrandParentMultyLevel obj2 = new GrandParentMultyLevel();
        System.out.println(obj2.age); //GrandParentMultyLevel : age 75

        GrandParentMultyLevel obj3 = new ChildMultyLevel ();
        System.out.println(obj3.age); //GrandParentMultyLevel : age 75
    }

}
