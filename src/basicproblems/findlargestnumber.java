package basicproblems;

import java.util.Scanner;

public class findlargestnumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = num.nextInt();



        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = num.nextInt();
        }

        

        int maxNumber = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        System.out.println("The largest number in the array is: " + maxNumber);
    }
}

