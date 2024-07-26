package basicproblems;

import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = a.nextInt();

        int rev = 0;
        while (num!=0) {

            rev = rev * 10 + num % 10;
            num = num / 10;
        }

            System.out.println(rev);


        }

}
