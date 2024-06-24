package org.example.collection;

import java.util.Comparator;

public class MyComparatorDEmo implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String S1 = o1.toString();
        String S2 = (String) o1;

        return  S2.compareTo(S1);
    }
}
