package com.shohan.abstraction;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        MobileUser mu; //can create reference varible 
        mu = new Rahim();
        mu.sendMessage();

        mu = new Karim();
        mu.sendMessage();
    }
}
