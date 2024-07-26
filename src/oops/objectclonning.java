package oops;

class student1 implements Cloneable{
    int id;
    String name;
    String deparrtment;

    student1(int i, String n, String dept) {
        id=i;
        name=n;
        deparrtment=dept;

    }
    void display(){
        System.out.println(name+id+deparrtment);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();

    }


}


public class objectclonning {
    public static void main(String[] args) throws CloneNotSupportedException {

        student1 s1= new student1(1,"ra","t");
        student1 s2=(student1) s1.clone();
        student1 s3 =(student1)s2.clone();
        s1.display();
        s2.display();
        s3.display();

    }
}
