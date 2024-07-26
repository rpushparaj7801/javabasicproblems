package basicproblems;

import java.util.Scanner;

public class primrornot {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter the number");
        int n = num.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("the no is not prime");

            } else{
            System.out.println(" prime");
            }

        }

    }
}


