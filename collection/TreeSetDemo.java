package org.example.collection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[])
    {
        TreeSet tr = new TreeSet(new MyComparator());
        tr.add(123);
        tr.add(456);
        tr.add(78);
        tr.add(13);
        //  tr.add(112);//hetergeous object are not allow
        //tr.add(null);//null insertion not possible
        System.out.println(tr);
    }
}
