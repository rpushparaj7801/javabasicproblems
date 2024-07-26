package controlstatment;

class studentt{
    String name;
    int age;
     static String teacherName="vinoth";
    void display(){
        System.out.println(name+" "+age+" "+teacherName);
    }


}


public class statickeyword {
    public static void main(String[] args) {
studentt obj =new studentt();
obj.name="raj";
obj.age=23;
obj.display();
    }
}
