package org.alpha.darshan.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSetGen {

    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();
        set1.add("darshan");
        set1.add("gaikwad");
        set1.add("darshan");
        System.out.println(set1);

        Iterator itr=set1.iterator();
        while (itr.hasNext()){

            System.out.println(itr.next());

                }
            }
        }


