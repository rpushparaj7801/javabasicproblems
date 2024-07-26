package collection;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class getset {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        list.add("raj");
        list.add("vino");
        list.add("abi");
        list.add("dhileep");
        list.add("this");

        System.out.println(list.get(1));

        list.set(1,"vinoth");
        System.out.println(list);


        for (String fruit:list)
            System.out.println(fruit);

        Collections.sort(list);

        System.out.println("-------After Sorting-------");

        for (String fruit :list
             ) {
            System.out.println(fruit);
        }


    }
}









