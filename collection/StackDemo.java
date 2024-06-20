package org.example.collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push("ankita");
        s.push(123);
        s.push("ABC");
        System.out.println(s);
        s.peek();
        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.search("ABC"));

    }
}
