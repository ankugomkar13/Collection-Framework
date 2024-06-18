package org.example.collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList l = new ArrayList();
        l.add("A");
        l.add("Ankita");
        l.add(null);
        l.add(2, "ranu");
        System.out.println(l);
        System.out.println(l.get(2));
        l.remove(3);
        System.out.println(l);

    }

}
