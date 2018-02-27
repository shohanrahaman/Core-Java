package com.shohan.collection;

import java.util.HashSet;

/**
 *
 * @author SHOHAN
 */
public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> furitsName = new HashSet<String>();
        furitsName.add("Apple");
        furitsName.add("Orange");
        furitsName.add("Banana");
        furitsName.add("Apple"); //Duplicate value not allow
        
        System.out.println(furitsName);
    }
}
