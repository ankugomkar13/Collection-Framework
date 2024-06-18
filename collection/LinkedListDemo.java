package org.example.collection;

import java.util.LinkedList;

public class LinkedListDemo {
   public static void main(String args[])
   {
       LinkedList l = new LinkedList();
       l.add("Ankita");
       l.add(30);
       l.add(null);
       l.addLast("1234");
       l.addFirst("Ranu");
       System.out.println(l);
       l.set(3,"many");
       System.out.println(l);
       l.removeLast();
       System.out.println(l);



   }

}
