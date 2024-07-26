package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class  student0 {
    int rollno;
    String name;
    int age;

    public student0(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

}
    class agecomparator implements Comparator<student0>{


        public int compare(student0 o1, student0 o2) {
            if (o1.age==o2.age)
            return 0;
            else if (o1.age>o2.age)
                return 1;
            else
                return -1;
        }
    }

    class namecomparator implements Comparator<student0>{

        @Override
        public int compare(student0 o1, student0 o2) {
            return o1.name.compareTo(o2.name)   ;
        }
    }




public class comparator {
    public static void main(String[] args) {

        List<student0> studs = new LinkedList<>();

        studs.add(new student0(10, "pushpa", 21));
        
        studs.add(new student0(11, "raj", 25));
        
        studs.add(new student0(12, "vinoth", 24));

        System.out.println("sorting by age");

        Collections.sort(studs,new agecomparator());
        for (student0 st : studs
             ) {
            System.out.println(st.age+" "+st.rollno+" "+st.name);
        }

        System.out.println("sorting by name");
        Collections.sort(studs,new namecomparator());
        for (student0 st : studs
             ) {
            System.out.println(st.age+" "+st.rollno+" "+st.name);
        }






      



    }
}
