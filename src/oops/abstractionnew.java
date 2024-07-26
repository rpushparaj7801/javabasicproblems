package oops;

abstract class vehicle{

  abstract public void   accelerate();

  void brake(){

      System.out.println("");
  }


  vehicle(){
      System.out.println(" this is oops.vehicle");
  }


}

class bike extends vehicle{
    public void   accelerate(){
        System.out.println("accelerating");

    }

}

public class abstractionnew {
    public static void main(String[] args) {

      bike obj =new bike();
      obj.accelerate();

    }
}
