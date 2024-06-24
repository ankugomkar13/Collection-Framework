package org.example.collection;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String args[])
    {
        TreeSet tr = new TreeSet(new MyComparatorDEmo());
        tr.add("V");
        tr.add("X");
        tr.add("A");
        tr.add("R");
        //  tr.add(112);//hetergeous object are not allow
        //tr.add(null);//null insertion not possible
        System.out.println(tr);
    }
}
