package BusReservation;

public class Bus {

   private int busNo;
   private boolean ac;
   private int capacity;
    

    public Bus(int busNo,boolean ac, int capacity ) {
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = capacity;
    }


   


    public boolean isAc() {
        return ac;
    }


    public int getCapacity() {
        return capacity;
    }




    public void setAc(boolean ac) {
        this.ac = ac;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void displaybusinfo(){
        System.out.println("bus no:"+busNo+"ac"+ac+"bus capacity"+capacity);
    }

    
}
