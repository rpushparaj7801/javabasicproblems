package basicarray;

import java.util.Arrays;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int arr[] = new int[10];





        System.out.println("enter 10 integer numbers ");
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = Scanner.nextInt();

        }
        int newarr[]=  Arrays.copyOf(arr,10);
        for (i = 0; i<arr.length; i++) {
            System.out.print(arr[i]);

        }




        for (i=newarr.length-1;i>=0;i--){
            System.out.print(newarr[i]);
        }





    }
}