package basicproblems;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner y = new Scanner(System.in);
        System.out.println("enter the year:");
        int year = y.nextInt();

        if(year%4==0 && year%100!=0  ) {
            System.out.println("this is leap year" + year);
        }else{
            System.out.println("this is not leap year" + year);

        }

    }
}
