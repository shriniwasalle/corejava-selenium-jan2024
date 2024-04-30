package org.alpha.akash.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Akki1");
        list.add("Akki2");
        list.add("Akki3");
        list.add("Akki4");

        System.out.println(list.add("Akki5")); //true
        System.out.println(list.size());
        list.add(1, "Akki11");
        System.out.println(list); // [Akki1, Akki11, Akki2, Akki3, Akki4, Akki5]

        list.set(1,"Akki111");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        list.remove(1);
        list.remove("Akki5");
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("Akki5");
        list1.add("Akki6");
        list1.add("Akki7");

        list.addAll(list1);
        System.out.println(list);//[Akki1, Akki2, Akki3, Akki4, Akki5, Akki6, Akki7]

        List<String> list2 = new ArrayList<>();
        list2.add("Akki8");
        list2.add("Akki9");
        list2.add("Akki10");


        list.addAll(7,list2);
        System.out.println(list);
        System.out.println(!list.isEmpty());// !false = true, !true=false

        System.out.println(list.contains("Akki10"));

        list.removeAll(list2);

        System.out.println(list);

        List<String> list3 = new ArrayList<>();
        list3.add("A");
        list3.add("1A");
        list3.add("2A");
        list3.add("B");
        list3.add("C");


        list3.sort(Comparator.naturalOrder());
        System.out.println(list3);
        list3.sort(Comparator.reverseOrder());
        System.out.println(list3);

        //list.clear();
        //System.out.println(list);//[]
        System.out.println(list.indexOf("Akki5"));

        Object []  arr = list.toArray();

        //Akki1
        //7
        String [] strArr = new String[6];
        for (int i = 0; i < arr.length; i++) {
            strArr[i] = arr[i].toString(); // strArr[0] = Akki1, strArr[1] = Akki2, strArr[2] = Akki3
            System.out.println(strArr[i]);
        }

    }
}

