package basicproblems;

import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        int n1=0, n2=1,sum=0;

        Scanner num= new Scanner(System.in);
        System.out.println("enter the no.");
        int n = num.nextInt();
        System.out.print(n1+ " " +n2);

        for (int i=2;i<n;i++)
        {
            sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;




        }

    }
}
