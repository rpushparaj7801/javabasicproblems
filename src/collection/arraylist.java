package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
    public static void main(String[] args) {

                ArrayList  list = new ArrayList<String>();
                list.add("Mango");
                list.add("Apple");
                list.add("Banana");
                list.add("Grapes");






                System.out.println(list);


                ArrayList<String > list1 = new ArrayList<>();
                list1.add("orange");

                list1.addAll(list);
        System.out.println(list1);



    }

}

