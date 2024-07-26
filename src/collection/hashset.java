package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class hashset {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //unordered unique elements

        set.add(34);
        set.add(36);
        set.add(36);
        set.add(40);
        set.add(45);
        set.add(37);
        set.add(49);
        set.add(46);

        Iterator <Integer> itr = set.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
