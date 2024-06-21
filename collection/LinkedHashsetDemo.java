package org.example.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
    public static void main(String args[]) {
        LinkedHashSet hs = new LinkedHashSet<>();
        hs.add("Ankita");
        hs.add(123);
        hs.add("Anku");
        hs.add(12345);
        System.out.println(hs.add("Ankita"));
        System.out.println(hs);
    }
}
