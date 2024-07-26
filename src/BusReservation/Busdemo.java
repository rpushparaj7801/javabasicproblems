package BusReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Busdemo {
    public static void main(String[] args) {
    

        ArrayList<Bus> buses = new ArrayList<>();
        buses.add(new Bus(1, true, 100));
        buses.add(new Bus(2,false,150));
        buses.add(new Bus(3,true,200));
        int useroption = 1;
        Scanner scanner = new Scanner(System.in);

        while (useroption==1) {
            System.out.println("enter 1 to book 2 to exit"); 
            useroption=scanner.nextInt();
            if (useroption==1) {
                System.out.println("booking....");
                
        } 
       
        }
        

    }
}
