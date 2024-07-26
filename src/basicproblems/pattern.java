package basicproblems;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number: ");
        int a = scan.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= i; j--) {
                System.out.print("*");
            }
                System.out.print("\n");



            }

    }
}
