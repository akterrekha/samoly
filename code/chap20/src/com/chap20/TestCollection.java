package com.chap20;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {

    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("new york");
        collection1.add("atlanta ");
        collection1.add("Dallas");
        collection1.add("madison");

        System.out.println("A list of cities in collection1: ");
        System.out.println(collection1);
        ///////
        System.out.println("\nIs Dallas in collection1?" + collection1.contains("Dallas"));
        /////
        collection1.remove("Dallas");
        System.out.println("\n" + collection1.size() + " cities are in collection1 now");
        System.out.println(collection1);
        ////////
        List<String> list2 = new ArrayList<>();
        list2.add("seattle");
        list2.add("potlanta ");
        list2.add("los angel");
        list2.add("atlanta");
        System.out.println("A list of cities in List2: ");
        System.out.println(list2);
        /////////
        ArrayList<String> c1 = (ArrayList<String>) (collection1.clone());
        c1.addAll(list2);
        System.out.println("\n cities in collection1 or list2: ");
        System.out.println(c1);
        //////
        c1 = (ArrayList<String>) (collection1.clone());
        c1.retainAll(list2);
        System.out.println("\n cities in collection1 and list2: ");
        System.out.println(c1);
        //////////////////
        c1 = (ArrayList<String>) (collection1.clone());
        c1.removeAll(list2);
        System.out.println("\n cities in collection1 but not in 2: ");
        System.out.println(c1);
    }
}
