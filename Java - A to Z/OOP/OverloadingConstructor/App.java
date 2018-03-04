package com.shohan.oop.OverloadingConstructor;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.displayInfo();

        Teacher t2 = new Teacher("Saiful Islam", 35);
        t2.displayInfo();

        Teacher t3 = new Teacher("Yasir Arafat", 40, "01717111111");
        t3.displayInfo();

    }
}
