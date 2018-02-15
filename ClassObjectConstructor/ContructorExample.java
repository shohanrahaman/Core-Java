package com.shohan.classObject;

/**
 *
 * @author SHOHAN
 */
public class ContructorExample {

    int id;
    String name;

    public ContructorExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID : " + id + " Name : " + name);
    }

    public static void main(String[] args) {
        ContructorExample ce = new ContructorExample(102, "shohan rahaman");
        ce.display();
    }

}
