package com.shohan.method_overriding;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "shohan";
        t.age = 50;
        t.qualification = "Msc in cse";
        t.displayInformation();

        //------------------------------
        Person p = new Person();
        p.name = "Rahman";
        p.age = 70;
        p.displayInformation();

    }
}
