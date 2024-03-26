package org.alpha.tejashri.corejava.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestListMethods {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        //ArrayList<String> list = new ArrayList<>(); can also allow bcz Arraylist is parent class of List class
        list.add("Shri1");
        list.add("Shri2");
        list.add("Shri3");

        System.out.println(list.add("Shri4")); // true, return type of add method is boolean
        System.out.println(list);

        System.out.println(list.size()); //4

        list.add(1, "Shri11");// will add the value at specified index previous index value will shift to next & so on
        System.out.println(list);
        list.set(1, "Shri111");// will replace the value at specified index
        System.out.println(list);

        System.out.println(list.get(0));// will give specified index value
        System.out.println(list.get(3));

        list.remove("Shri111"); // will remove specified object value
        System.out.println(list);

        list.remove(3);// will remove specified index object value
        System.out.println(list);

        List<String> list1 = new ArrayList<>();

        list1.add("Shri4");
        list1.add("Shri5");
        list1.add("Shri6");
        list.addAll(list1); // will add all values of list1 into list

        List<String> list2 = new ArrayList<>();

        list2.add("Shri7");
        list2.add("Shri8");
        list2.add("Shri9");

        list.addAll(0, list2);// will add all values of list1 at specified index of list
        System.out.println(list);

        list.removeAll(list2); // will remove all list2 values from list
        System.out.println(list);

        list.addAll(6, list2);
        System.out.println(list);

        System.out.println(list.isEmpty());// false, will check that is that list is empty or not
        System.out.println(!list.isEmpty());// true, !false=true, !true=false

        System.out.println(list.contains("Shri9"));// true, will check that specified object/value is present or not
        System.out.println(list.contains("Shri111"));// false

        list.sort(Comparator.reverseOrder()); // will give the Revers Order object values
        System.out.println(list);

        list.sort(Comparator.naturalOrder()); // will give the Natural Order object values
        System.out.println(list);

        List<Character> list3 = new ArrayList<>();

        list3.add('A');
        list3.add('C');
        list3.add('B');
        list3.sort(Comparator.reverseOrder());//[C, B, A]
        System.out.println(list3);

        list3.sort(Comparator.naturalOrder());//[A, B, C]
        System.out.println(list3);

        Collections.sort(list3);//[A, B, C]
        System.out.println(list3);

        System.out.println("----Iteration of list3 Using for each loop----");
        //Iteration of list3 using for each & for loop
        for (Character i : list3){
            System.out.println(i);
        }

        System.out.println("----Iteration of list3 Using for loop----");
        for(int i =0; i<list3.size(); i++){
            System.out.println(list3.get(i));
        }

        List<String> list4 = new ArrayList<>();

        list4.add("Shri");
        list4.add("Anshu");
        list4.add("Mahi");
        System.out.println(list4);//[Shri, Anshu, Mahi]

        Collections.sort(list4);//[Anshu, Mahi, Shri]
        System.out.println(list4);

        //Iteration of list4 using for each
        System.out.println("----Iteration of list4 Using for each loop----");
        for (String i : list4){
            System.out.println(i);
        }

        list4.sort(Comparator.reverseOrder());//[Shri, Mahi, Anshu]
        System.out.println(list4);

        list4.sort(Comparator.naturalOrder());//[Anshu, Mahi, Shri]
        System.out.println(list4);

        System.out.println(list);
        System.out.println(list.indexOf("Shri7")); // 6 will give the specified object index

        //Iteration of list using for each & for loop
        System.out.println("----Iteration of list Using for each loop----");
        for (String i : list){
            System.out.println(i);
        }

        System.out.println("----Iteration of list Using for loop----");
        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("----Array converting to string----");
        // Array converting to string
        // Using Object[]
        Object[] arr = list.toArray(); //object[] bcz return type of toArray is Object
        System.out.println(arr.length); //9

        System.out.println("----Using for each loop----");
        // Iterate over the Object[] & convert each object to a string
        for (Object obj : arr) {
            String str = obj.toString();
            System.out.println(str);
        }

        // Another way, Using String[]
        String[] strArr = new String[arr.length];
        System.out.println(arr.length); //9

        // Iterate over the String[] & convert each object to a string
        System.out.println("----Using for loop----");
        for (int i = 0; i < arr.length; i++) {
            strArr[i] = arr[i].toString(); // strArr[0]=Shri1, strArr[1]=Shri2, strArr[2]=Shri3,.......
            System.out.println(strArr[i]);
        }

        list.clear();
        System.out.println(list);// [], will clear all list/collection
    }
}
