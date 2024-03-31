package org.alpha.sanjeevani.onlycorejavaconcepts.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestListMethod {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Raje1");
        list1.add("Raje2");
        list1.add("Raje3");
        System.out.println(list1.add("Raje4"));//true

        System.out.println(list1.size());//4

        list1.add(0,"Raje0"); // adding Raje0 at 0th location

        System.out.println(list1);  //[Raje0, Raje1, Raje2, Raje3, Raje4]

        list1.set(1,"Raje11");

        System.out.println(list1);//[Raje0, Raje11, Raje2, Raje3, Raje4] raplace existing element to new one

        System.out.println(list1.get(3));//Raje3

        list1.remove("Raje11");

        System.out.println(list1);//[Raje0, Raje2, Raje3, Raje4] removing Raje11

        list1.remove(0);

        System.out.println(list1);//[Raje2, Raje3, Raje4] removing Raje0 element from 0th index


        List<String> list2 = new ArrayList<>();
        list2.add("Raje5");
        list2.add("Raje6");
        list2.add("Raje7");

        list1.addAll(list2);
        System.out.println("after adding list2  :"+list1); //after adding list2  :[Raje2, Raje3, Raje4, Raje5, Raje6, Raje7]

        List<String> list3 = new ArrayList<>();
        list3.add("Raje8");
        list3.add("Raje9");

       /* list1.addAll(6,list3);
        System.out.println(list1);//[Raje2, Raje3, Raje4, Raje5, Raje6, Raje7, Raje8, Raje9]
*/
        list1.addAll(1,list3);//
        System.out.println("After adding list3 at 1st position"+list1);//element Raje8 and Raje9 add at 1st index


        System.out.println(list1.isEmpty()); //false

        System.out.println(!list1.isEmpty());   //true
        //!true=false !false=true

        System.out.println(list1.contains("Raje6"));//truex

        list1.removeAll(list3);
        System.out.println("after removing list3:"+list1);//after removing list3:[Raje2, Raje3, Raje4, Raje5, Raje6, Raje7]

        list1.sort(Comparator.reverseOrder());
        System.out.println("reverseOrder is :"+list1); //reverseOrder is : [Raje7, Raje6, Raje5, Raje4, Raje3, Raje2]

        list1.sort(Comparator.naturalOrder());
        System.out.println("naturalOrder is :"+list1); //naturalOrder is :[Raje2, Raje3, Raje4, Raje5, Raje6, Raje7]

        //list1.clear();
        //System.out.println(list1);




    }
}
