package dummy;

class outer{
    int a;
    void display(){
        System.out.println("This is inner class: " +a);

    }

    class inner{
        int b=30;
        void display(){
            System.out.println("This is dummy.outer class: " +b);
        }
    }
}

public class innerclass {
    public static void main(String[] args) {

        outer o = new outer();
        o.a=40;
        o.display();
        outer.inner i = o.new inner();
        i.display();


    }
}
