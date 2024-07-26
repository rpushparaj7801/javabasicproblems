package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class listiterator{
    public static void main(String[] args) {



            ArrayList<String> list=new ArrayList<String>();
            list.add("Mango");
            list.add("Apple");
            list.add("Banana");
            list.add("Grapes");

        System.out.println("print using list iterator");

        ListIterator<String> list1 = list.listIterator();
        while (list1.hasPrevious()){
            String str =list1.previous();
            System.out.println(str);
        }


        System.out.println("print using for loop");

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("print using for each loop");

        for (String fruit:list) {
            System.out.println(fruit);
        }


        System.out.println("print using for each method");

        list.forEach(a->{
            System.out.println(a);
        });

        }

    }


