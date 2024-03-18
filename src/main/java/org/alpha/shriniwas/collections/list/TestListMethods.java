package org.alpha.shriniwas.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestListMethods {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Shri1");
        list.add("Shri2");
        list.add("Shri3");

        System.out.println(list.add("Shri4"));
        System.out.println(list.size()); // 4
        list.add(1, "Shri11");

        System.out.println(list); // [Shri1, Shri11, Shri2, Shri3, Shri4]

        list.set(1, "Shri111");

        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        list.remove("Shri111");

        System.out.println(list);

        list.remove(3);

        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("Shri4");
        list1.add("Shri5");
        list1.add("Shri6");

        list.addAll(list1);

        // list = [Shri1, Shri2, Shri3]
        // list1 = [Shri4, Shri5, Shri6]
        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list2.add("Shri7");
        list2.add("Shri8");
        list2.add("Shri9");

        list.addAll(6, list2);

        System.out.println(list);

        System.out.println(!list.isEmpty()); // !false = true, !true=false

        System.out.println(list.contains("Shri9"));

        list.removeAll(list2);

        System.out.println(list);

        List<Character> list3 = new ArrayList<>();
        list3.add('A');
        list3.add('C');
        list3.add('B');

        list3.sort(Comparator.naturalOrder()); // low - high : Shri1, Shri2, Shri3
        System.out.println(list3);
        list3.sort(Comparator.reverseOrder()); // low - high : Shri3, Shri2, Shri1
        System.out.println(list3);

        System.out.println(list);

        // list.clear();

        System.out.println(list.indexOf("Shri6"));

        Object [] arr = list.toArray();

        // Shri1,
        // 6

        String [] strArr = new String[6];

        for (int i = 0; i < arr.length; i++) {
            strArr[i] = arr[i].toString(); // strArr[0] = Shri1, strArr[1] = Shri2, strArr[2] = Shri3
            System.out.println(strArr[i]);
        }

    }
}
