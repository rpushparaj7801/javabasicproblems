package collection;

import java.util.ArrayList;
import java.util.Iterator;

class student{

        int rollno;
        String name;
        int age;
        student(int rollno,String name,int age ){
            this.rollno=rollno;
            this.name=name;
            this.age = age;
            
        }

}

public class userdefinedobject {
    public static void main(String[] args) {

        student s1 = new student(1,"raj",22);
        student s2 = new student(2,"vinoth",23);
        ArrayList<student> stu = new ArrayList<student>();
        stu.add(s1);
        stu.add(s2);
        Iterator itr = stu.iterator();
        while (itr.hasNext()){
            student s = (student) itr.next();

            System.out.println(s.rollno+" "+s.name+" "+s.age );
        }


    }
}
