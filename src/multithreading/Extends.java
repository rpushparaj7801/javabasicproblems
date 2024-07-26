package multithreading;


class A extends Thread{
    public void avi(){
        for (int i=1;i<=5;i++){
            System.out.println("Hi");
            try {Thread.sleep(2000);} catch (InterruptedException e) {}
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Hello");
            try {Thread.sleep(1000);} catch (Exception e) {

            }
        }
    }
}
public class Extends {
    public static void main(String[] args) throws Exception {

        A a = new A();
        B  b = new B();

        a.avi();
        b.start();


        a.join();
        b.join();


        System.out.println("bye");




    }
}
