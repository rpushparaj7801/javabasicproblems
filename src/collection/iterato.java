package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class iterato {
    public static void main(String[] args) {

                LinkedList<String> list=new LinkedList<String>();
                list.add("Mango");
                list.add("Apple");
                list.add("Banana");
                list.add("Grapes");

        Iterator itr = list.descendingIterator();


        while (itr.hasNext()) {

            System.out.println(itr.next());



        }


        for(String fruit:list)
            System.out.println(fruit);



    }
}
