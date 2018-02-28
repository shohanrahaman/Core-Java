package com.shohan;

/**
 *
 * @author SHOHAN
 */
public class FormatSpecifier {

    public static void main(String[] args) {
        boolean b = true;
        double d = 25.456566;

        System.out.printf("boolean b = %b", b);
        System.out.printf("double d = %d.3f", d);
    }
}
