package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class listtoarray {
    public static void main(String[] args) {
        ArrayList<String > list =  new ArrayList<>();
        list.add("Mango");
        list.add("Banana");
        list.add("Apple");
        list.add("Strawberry");

        System.out.println("list"+list);

        String arr []= list.toArray((new String[list.size()]));
        System.out.println(Arrays.toString(arr));





    }
}
