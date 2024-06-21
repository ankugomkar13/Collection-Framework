package org.example.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String args[])
    {
        HashSet hs = new HashSet<>();
        hs.add("Ankita");
        hs.add(123);
        hs.add("Anku");
        hs.add(12345);
        System.out.println(hs.add("Ankita"));
        Iterator itr = hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
