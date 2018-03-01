package com.shohan.mathClass;

/**
 *
 * @author SHOHAN
 */
public class MathClass {

    public static void main(String[] args) {
        int x = 5;
        int y = 2;

        int max = Math.max(x, y);
        System.out.println("maximum = " + max);

        int min = Math.min(x, y);
        System.out.println("minimum = " + min);

        int absolute = Math.abs(x);
        System.out.println("absulute of y = " + absolute);

        double power = Math.pow(x, y);
        System.out.println("x to the power y = " + power);

        double pi = Math.PI;
        System.out.println("pi = " + pi);
    }
}
