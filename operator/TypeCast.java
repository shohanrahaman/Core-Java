package com.shohan.operator;

/**
 *
 * @author SHOHAN
 */
public class TypeCast {

    public static void main(String[] args) {
        //String to int
        String s = "14";
        int stoi = Integer.parseInt(s);
        System.out.println(stoi);
        //int to String
        int i = 14;
        String itos = Integer.toString(i);
        System.out.println(itos);
        //Double to String
        double d = 12.8d;
        String dtos = Double.toString(d);
        System.out.println(dtos);
        //--------------
        short a = 10;
        short b = 10;
        a = (short) (a + b);
        System.out.println(a);
    }
}

