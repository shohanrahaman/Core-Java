package com.shohan.oop.LocalClassInstanceVariable;

/**
 *
 * @author SHOHAN
 */
public class VariableType {

    String name; //Instance variable inside Class and outside method
    int id;
    static String universityName; //static variable

    //Local variable is declare  inside method , constructor or in a block.
    VariableType(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("University : " + universityName);
    }
}
