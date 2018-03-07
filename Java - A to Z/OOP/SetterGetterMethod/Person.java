package com.shohan.oop.SetterGetterMethod;

/**
 *
 * @author SHOHAN
 */
public class Person {

    private String name;
    private int age;

    //Setter & Gretter use for accessing private data
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
