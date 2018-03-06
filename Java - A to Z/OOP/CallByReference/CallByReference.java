package com.shohan.oop.CallByReference;

/**
 *
 * @author SHOHAN
 */
public class CallByReference {

    //Call-By-Reference / Pass-By-Reference
    String name;

    public void change(CallByReference r2) {  //Object of type : call-by-reference
        r2.name = "Rahaman";
    }
}
