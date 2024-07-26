package string;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                String[] words = input.split(" ");

                for (int i = words.length; i > 0; i--) {
                    System.out.print(words[i]+ " ");
                }

        }
        }












