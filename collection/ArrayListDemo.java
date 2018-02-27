package com.shohan.collection;

import java.util.ArrayList;

/**
 *
 * @author SHOHAN
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();
        
        // Adding element
        number.add(10);
        number.add(20);
        number.add(1, 40);

        System.out.println(number);
        System.out.println(number.size()); //Array size
    }
}
