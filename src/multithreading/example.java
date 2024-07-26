package multithreading;


class Pushpa implements Runnable{
  public void run()  {
      for (int i=1;i<=5;i++){

          System.out.println("this is pushparaj");

          try {
              Thread.sleep(3000);
          } catch (InterruptedException e) {}
      }

  }
}

class Vinoth implements Runnable{
    public void run(){
        for (int i=1;i<=5;i++){

            System.out.println("this is vinoth");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }



    }
}
public class example {
    public static void main(String[] args) throws InterruptedException {


        Runnable obj = new Pushpa();
        Runnable obj1 = new Vinoth();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);


        t1.start();
        System.out.println("thread 1 is  ");


        t2.start();
        System.out.println("thread 2 is  ");


        t1.join();
        t2.join();

        System.out.println("bye....................");


    }
}
