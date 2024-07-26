package collection;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraytolist {
    public static void main(String[] args) {
        String arr[] = {"what","where","when","why"};
        System.out.println(Arrays.toString(arr));

        List<String> list = new ArrayList<>();
        for (String str:arr
             ) {
           list.add(str);

        }
        System.out.println(list);
    }
}




