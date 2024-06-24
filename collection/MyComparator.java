package org.example.collection;

import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer I = (Integer) o1;
        Integer I2 = (Integer) o2;
        if(I<I2)
        {
            return 1;
        } else if (I>I2) {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
