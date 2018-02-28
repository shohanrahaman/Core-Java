package com.shohan;

/**
 *
 * @author SHOHAN
 */
public class ControlStatementSelection {

    public static void main(String[] args) {
        /*
         #Control Statement :
         1.Selection
            -if
            -if else
            - if else if
            -switch
         2.Iteration/Looping
            -for
            -while
            -do while
         3.Jump
            -break
            -continue
            -return
         */

        //if
        int x = 10;

        if (x > 0) {
            System.out.println("Positive");
        }

        //if else
        int y = -5;

        if (y > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Nagetive");
        }

        //if else if
        int z = 0;

        if (z > 0) {
            System.out.println("Positive");
        } else if (z < 0) {
            System.out.println("Nagetive");
        } else {
            System.out.println("Equal or Zero");
        }
    }
}
