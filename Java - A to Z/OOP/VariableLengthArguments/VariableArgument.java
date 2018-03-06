package com.shohan.oop.VariableLengthArguments;

/**
 *
 * @author SHOHAN
 */
public class VariableArgument {

    //Variable Length Arguments
    public void add(int... num) {

        int sum = 0;
        for (int x : num) {
            sum = sum + x;
        }
        System.out.println("Sum is : " + sum);

    }
}
