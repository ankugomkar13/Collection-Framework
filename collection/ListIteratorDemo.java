package org.example.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String args[])
    {

    {
        LinkedList l = new LinkedList();
        for(int i=2;i<=20;i++)
        {
            l.add(i);
        }
        ListIterator itr = l.listIterator();
        while (itr.hasNext())
        {
            Integer num = (Integer) itr.next();
            if(12==num)
            {
                itr.remove();
            }
            else {

                itr.set(45);
            }
        }
        System.out.println(l);
    }}
}
