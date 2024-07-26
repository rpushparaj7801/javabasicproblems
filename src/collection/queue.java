package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {

        public static void main(String[] args) {
            PriorityQueue<String> queue =new PriorityQueue<>();


            queue.add("Alice");
            queue.add("Bob");
            queue.add("Charlie");

            Iterator itr = queue.iterator();

            while (itr.hasNext()){
                System.out.println("print using iterator "+itr.next());

            }


            System.out.println("head is "+queue.peek());


            System.out.println(queue);
            System.out.println("remove head "+queue.remove());
            System.out.println(queue);

            System.out.println(queue.size());
            System.out.println(queue.isEmpty());







        }
    }

