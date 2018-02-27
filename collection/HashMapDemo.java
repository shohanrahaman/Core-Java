package com.shohan.collection;

import java.util.HashMap;

/**
 *
 * @author SHOHAN
 */
public class HashMapDemo {

    public static void main(String[] args) {
        // key,value
        HashMap<Integer, String> customer = new HashMap<Integer, String>();
        // put()
        customer.put(101, "shohan");
        customer.put(102, "rahaman");
        // get()
        System.out.println(customer.get(101));
        System.out.println(customer.get(102));


    }
}
