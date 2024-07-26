package collection;


import java.util.EnumSet;
import java.util.Set;

enum days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class enumclass {
    public static void main(String[] args) {
        Set<days> d = EnumSet.allOf(days.class);

        for (days d1 :d
             ) {
            System.out.println(d1);
        }


        System.out.println(EnumSet.allOf(days.class));


    }
}
