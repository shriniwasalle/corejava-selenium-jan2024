package org.alpha.tejashri.corejava.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(100); //0 index
        list1.add(200);//1
        list1.add("Tejashri");//2
        list1.add('X');//3
        list1.add(99.9f);//4
        list1.add(911.9d);//5
        list1.add(null);//6
        list1.add(100);//7
        list1.add(null);//8
        System.out.println("List1 : " + list1);

        list1.add(3, 'Z');// its add at the index of 3, previous index 3 value will shift to 4 & so on for the next all index values
        System.out.println("List1 After add at specified index: " + list1);
        System.out.println("Size of List1 : " + list1.size());

        list1.set(2, "Shri");//it will replace the value at specified index
        System.out.println("List1 after set at specified index : " + list1);

        List list2 = new ArrayList();
        int [] arr = {55, 66, 77};
        list2.add(arr); // will add the Hash codes/memory location of that values
        list2.add(500);
        list2.add("Anshika");
        System.out.println("List2 : " + list2);

        list2.addAll(list1); // will add all list1 objects/values into list2
        System.out.println("List2 after adding list1 : " + list2);

        List obj = new ArrayList(); //List: parent/interface, ArrayList : child/class
        // Runtime polymorphism/Overriding concept

        obj.add("Mahika");
        obj.add(600);//objects means elements
        System.out.println(obj);
    }
}
