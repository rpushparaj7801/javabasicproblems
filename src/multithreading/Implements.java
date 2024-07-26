package multithreading;
class One implements Runnable{
    public void run(){

        for (int i=1;i<=5;i++){
            System.out.println("hi pushparaj");
            try { Thread.sleep(2000);} catch (Exception e) {}
        }
    }
}
class Two  implements Runnable   {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello vinoth");
            try { Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}
public class Implements{
    public static void main(String[] args)  {
        Runnable ne = new One();
        Runnable  wo = new Two();

       Thread t1= new Thread(ne);
       Thread t2 =  new Thread(wo);


        t1.start();
        t2.start();


    }
}
