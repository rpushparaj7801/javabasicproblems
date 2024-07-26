package multithreading;
class raj implements Runnable {

    public void run() {
        System.out.println("now the thread is running");
    }
}

public class example3 {
    public static void main(String[] args) {


        Runnable r1 = new raj();
        
      Thread t1 = new Thread(r1,"raj");
        
       t1.start();
          String str = t1.getName();
        System.out.println(str);

    }
    }



