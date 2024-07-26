package basicarray;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {

        int positive = 0,negative = 0, odd = 0, even = 0,zeros = 0;

        Scanner num = new Scanner(System.in);
        System.out.println("enter 15 integers numbers");


        int arr[]=new int[15];
        for (int i = 0; i < 15; i++) {

            arr[i] = num.nextInt();

            if ( arr[i]>0){
                positive++;
            }
            if ( arr[i] <0){

                negative++;
            }
            if ( arr[i]%2==0){

                even++;
            }
            if ( arr[i]%2!=0){

                odd++;
            }
            if ( arr[i]==0){

                zeros++;
            }

        }

        System.out.println("positive numbers are"+positive+" ");
        System.out.println("negative numbers are"+negative);
        System.out.println("odd numbers are"+odd);
        System.out.println("even numbers are"+even);
        System.out.println("zeros numbers are"+zeros);

    }
}

