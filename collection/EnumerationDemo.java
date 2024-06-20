package org.example.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String args[])
    {
        Vector v = new Vector();
        for(int i = 0;i<=10;i++)
        {
            v.addElement(i);
        }
        Enumeration em = v.elements();
        while (em.hasMoreElements())
        {
            Integer I = (Integer) em.nextElement();
            System.out.println(I);
        }

        System.out.println(v);
    }
}
