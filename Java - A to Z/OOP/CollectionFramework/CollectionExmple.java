package com.shohan.oop.CollectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author SHOHAN
 */
public class CollectionExmple {

    public static void main(String[] args) {
        /*
         List allow duplicate value
         List use add() method
         We created LinkedList object and keep it within  List
         */
        List l = new LinkedList();
        l.add("Shohan");
        l.add("Rahaman");
        l.add("Saiful");
        l.add("Shohan");
        print(l);

        /*
         Set don't allow duplicate value
         */
        Set s = new HashSet();
        s.add("Shohan");
        s.add("Rahaman");
        s.add("Saiful");
        s.add("Shohan");
        print(s);

        /*
         TreeSet by default Sorted
         */
        SortedSet ss = new TreeSet();
        ss.add("Shohan");
        ss.add("Rahaman");
        ss.add("Saiful");
        ss.add("Shohan");
        print(ss);

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("Shohan");
        lhs.add("Rahaman");
        lhs.add("Saiful");
        lhs.add("Shohan");
        print(lhs);

        /*
         Map keep value(Key,Values)
         Map use put() method
         Print KeySet, Values
         */
        Map m = new HashMap();
        m.put("JAVA", "Shohan");
        m.put("DBA", "Arafat");
        m.put("DDD", "Saiful");
        print(m.keySet());
        print(m.values());
        //print(m.entrySet());

        SortedMap sm = new TreeMap();
        sm.put("JAVA", "Shohan");
        sm.put("DBA", "Arafat");
        sm.put("DDD", "Saiful");
        print(sm.keySet());
        print(sm.values());
    }

    //Collection receive all object
    static void print(Collection coll) {
        //Iterator interface  | Convert Iterator 
        Iterator it = coll.iterator();
        //hasNext return boolean
        while (it.hasNext()) {
            String el = (String) it.next();
            System.out.println(el + " ");
        }
        System.out.println();
    }
}
