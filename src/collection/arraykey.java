package collection;

import java.util.ArrayList;

public class arraykey {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);


        System.out.println(list.get(2));


        list.set(2,5);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.size());

    }
}
