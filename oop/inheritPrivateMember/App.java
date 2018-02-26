package com.shohan.oop.inheritPrivateMember;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("Shohan Rahaman");
        t.setAge(50);
        t.setQualification("Msc in cse");
        t.display();

    }
}
