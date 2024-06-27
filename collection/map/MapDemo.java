package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String args[])
    {
        Map mp = new HashMap();
        mp.put(12,"Ankita");
        mp.put(123, 12);
        mp.put(1234, "Rani");
        System.out.println(mp);
        System.out.println(mp.containsKey(12));
        System.out.println(mp.containsValue("Ankita"));
        System.out.println(mp.entrySet());
        System.out.println(mp.get(12));
        mp.remove(12);
        System.out.println(mp);
        mp.replace(123, "Raanu");
        System.out.println(mp);
        System.out.println(mp.size());
        System.out.println();
    }
}
