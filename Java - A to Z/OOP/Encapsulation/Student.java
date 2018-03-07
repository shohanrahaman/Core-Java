package com.shohan.oop.Encapsulation;

/**
 *
 * @author SHOHAN
 */
public class Student { //Packaging variables and methods into a single unite.

    //Protecting data by declaring them as private [Data Hiding]
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void display() {

        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
    }
}
