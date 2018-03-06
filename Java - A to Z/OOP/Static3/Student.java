package com.shohan.oop.Static3;

/**
 *
 * @author SHOHAN
 */
public class Student {

    public static int count = 0;

    Student() {
        count++;
    }

    public void totalStudent() {

        System.out.println("Total Student : " + count);
    }
}
