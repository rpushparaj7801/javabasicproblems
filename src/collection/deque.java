package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {

        Deque< Integer > d = new ArrayDeque<>();


        d.add(23);
        d.add(34);
        d.add(45);
        d.add(56);
        d.offer(1);
        d.offerFirst(2);


        for (Integer i :d) {
            System.out.println(i);}

        System.out.println(d.pollFirst());
        System.out.println(d.pollLast());

        System.out.println(d.poll());


    }
}
