package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class map {
    public static void main( String[] args) {
         Map<Integer, String> m = new HashMap();

        m.put(101, "pushparaj");
        m.put(102, "vinoth");

        System.out.println(m);
        System.out.println(m.get(102));
        System.out.println(m.size());
        System.out.println(m.containsKey(101));
        System.out.println(m.containsValue("vinoth"));

        System.out.println(m.keySet() + "" + m.values());
        System.out.println(m.values());
        m.putIfAbsent(34, "ra");
        System.out.println(m);
        System.out.println(m.remove(34));

        System.out.println(m.entrySet());

        for (Map.Entry m1 : m.entrySet()
             ) {
            System.out.println(m1);

        }


//         Set s = m.entrySet();
//         Iterator i = s.iterator();
//         while (i.hasNext()) {
//
//
//            Map.Entry entry = (Map.Entry) i.next();
//
//        System.out.println(entry.getKey() + "" + entry.getValue());
//
//    }


    }

}
