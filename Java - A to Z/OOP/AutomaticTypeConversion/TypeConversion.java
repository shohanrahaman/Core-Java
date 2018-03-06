package com.shohan.oop.AutomaticTypeConversion;

/**
 *
 * @author SHOHAN
 */
public class TypeConversion {

    //long,float,double <--- int  [Autometic type convert]
    public void add(double a, double b) {
        System.out.println(a + b);
    }

    public void add(double a, int b) {
        System.out.println(a + b);
    }
}
