package basicproblems;

import java.util.Scanner;

public class oddnumber {
    public static void main(String[] args) {
        for(int j=1;j<=10;j++){
        Scanner num = new Scanner(System.in);
        System.out.println("enter the no.");
        int i = num.nextInt();

        if(i%2==0) {
            System.out.println("even");
        }
            else {
                System.out.println("odd");

            }
        }
    }}

