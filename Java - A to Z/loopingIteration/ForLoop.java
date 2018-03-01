package com.shohan.loopingIteration;

/**
 *
 * @author SHOHAN
 */
public class ForLoop {

    public static void main(String[] args) {
        //simple
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " I Love Java");
        }

        //Reverse
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + " Reverse Number");
        }

        //Even
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.println(i + " Even Number");
        }

        //Odd
        for (int i = 1; i <= 100; i = i + 2) {
            System.out.println(i + " Odd Number");
        }
    }
}
