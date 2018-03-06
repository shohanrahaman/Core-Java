package com.shohan.oop.Recursion;

/**
 *
 * @author SHOHAN
 */
public class Factorial {

    //Recursion -- Call by it's self

    int fact(int n) {
        if (n == 1) { //Base case [stop condition]
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
