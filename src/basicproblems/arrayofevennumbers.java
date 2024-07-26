package basicproblems;

import java.util.Scanner;

public class arrayofevennumbers {
    public static void main(String[] args) {

int a[]=new int [10], i;

        Scanner arr= new Scanner(System.in);
        System.out.println("enter 10 numbers");
        for (i=0;i<10;i++)
        {
            a[i]= arr.nextInt();
        }
        System.out.println("the even numbers are: ");
        for (i=0;i<10;i++)
        {
            if (a[i]%2==0)
            {
                System.out.println(a[i]);
            }
        }









    }
}
