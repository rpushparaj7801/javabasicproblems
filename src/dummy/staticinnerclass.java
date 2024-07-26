package dummy;

class A{
    static  int a=10;
   static int b=20;
   static class B{

        void display(){
            System.out.println(a+" "+b);
        }
    }

}

public class staticinnerclass {
    public static void main(String[] args) {

        A.B o = new A.B();
        o.display();

    }
}
