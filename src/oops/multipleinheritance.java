package oops;

/*
class phone{
   void voicecall(){
       System.out.println("voice call");

   }

   void sms(){
       System.out.println("sms");
   }
}
interface camera{
   void click();
   void record();

}
interface player{
   void play();
   void pause();
   void stop();
}

class smartphone extends phone implements camera,player{

   @Override
   public void click() {
       System.out.println("click");
   }

   @Override
   public void record() {
       System.out.println("record");
   }

   @Override
   public void play() {
       System.out.println("play");
   }

   @Override
   public void pause() {
       System.out.println("pause");
   }

   @Override
   public void stop() {
       System.out.println("stop");
   }
}

public class multipleinheritance {
   public static void main(String[] args) {

       smartphone obj =new smartphone();
       obj.voicecall();
       obj.sms();
       obj.click();
       obj.record();
       obj.play();
       obj.pause();
       obj.stop();

   }
}   */
interface Printable{
    void print();

}
interface Showable extends Printable{
    void show();
}
class TestInterface4 implements Printable,Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        TestInterface4 obj = new TestInterface4();
        obj.print();
        obj.show();
    }
}