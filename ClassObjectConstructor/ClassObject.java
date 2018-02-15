package com.shohan.classObject;

/**
 *
 * @author SHOHAN
 */
public class ClassObject {

    int id; // field or data member or instance variable
    String name;

    public static void main(String[] args) {
        ClassObject co = new ClassObject(); //Creating an object of ClassObject
        System.out.println("Id : " + co.id + " Name : " + co.name); //Accessing member through reference variable
    }
}
