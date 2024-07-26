package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> s= new TreeSet<>();
        s.add(23);
        s.add(274);
        s.add(605);
        s.add(23);
        s.add(67);
        s.add(27);
        s.add(280);
        s.add(20);

        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.contains(23));

        Iterator i = s.descendingIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println(s.descendingSet());
        System.out.println(s.ceiling(67));
        System.out.println(s);
        System.out.println(s.headSet(27));
        System.out.println(s.tailSet(67));
        System.out.println(s.subSet(27,280));

        System.out.println("lowest value"+s.pollFirst());
        System.out.println("highest value"+s.pollLast());


    }
}
