package dummy;

abstract class  a{

    abstract void display();
}
public class anonymousclass {
    public static void main(String[] args) {
        a obj = new a() {

            void display() {
                System.out.println("this is anonymous class");
            }
        };
        obj.display();
    }
}
