package com.shohan.oop.VariableLengthArguments;

/**
 *
 * @author SHOHAN
 */
public class App {
    
    public static void main(String[] args) {
        VariableArgument va = new VariableArgument();
        va.add(10, 20, 30, 40, 50);
        va.add(11, 22, 33);
        
    }
}
