package com.shohan.collection;

import java.util.LinkedList;

/**
 *
 * @author SHOHAN
 */
public class LinkedListDemo2 {

    public static void main(String[] args) {
        LinkedList<String> countryNames = new LinkedList<String>();
        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("America");
        countryNames.add(3, "Pakistan"); //using index
        countryNames.addFirst("Australia");
        countryNames.addLast("Japan");
        countryNames.remove("India");
        countryNames.removeFirst();
        countryNames.removeLast();
        countryNames.getFirst();
        countryNames.getLast();
        countryNames.clear();

        for (String x : countryNames) {
            System.out.println(x);
        }

    }
}
