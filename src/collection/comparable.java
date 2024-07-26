package collection;

import java.util.ArrayList;
import java.util.Collections;

class studentt implements Comparable<studentt> {
  int rollno;
  String name;
  int age;

  studentt(int rollno,String name,int age){

      this.rollno=rollno;
      this.name=name;
      this.age=age;
  }
  public int compareTo(studentt s){
      if (age==s.age)
          return 0;
      else if (age>s.age)
          return 1;
      else
          return -1;

      }
  }
  public class comparable {
    public static void main(String[] args) {

        ArrayList<studentt> al = new ArrayList<studentt>();
        al.add(new studentt(101,"raj",24));
        al.add(new studentt(102,"vino",20));
        al.add(new studentt(103,"puhpa",23));


        Collections.sort(al);
        for(studentt st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
