package basicproblems;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("enter the no: ");
                int n =num.nextInt();
        if(n%2==0) {
            System.out.println("the no. is even " + n);
        }else
            System.out.println("the no. is odd " + n);

    }
}
