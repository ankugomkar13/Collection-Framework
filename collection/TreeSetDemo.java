package org.example.collection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[])
    {
        TreeSet tr = new TreeSet();
        tr.add("B");
        tr.add("E");
        tr.add("A");
        tr.add("Z");
      //  tr.add(112);//hetergeous object are not allow
        //tr.add(null);//null insertion not possible
        System.out.println(tr);
    }
}
