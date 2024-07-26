package string;

import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string of alphabets: ");
            String input = scanner.nextLine().toLowerCase();
            int[] occurrences = new int[26];


            for (char ch : input.toCharArray()) {
                if (Character.isLetter(ch)) {
                    occurrences[ch - 'a']++;
                }
            }


            int maxCount = 0;
            char maxChar = ' ';
            for (int i = 0; i < 26; i++) {
                if (occurrences[i] > maxCount) {
                    maxCount = occurrences[i];
                    maxChar = (char) ('a' + i);
                }
            }

      System.out.println("Occurrences of each alphabet:");
     for (char ch = 'a'; ch <= 'z'; ch++) {
          if (occurrences[ch - 'a'] > 0) {
               System.out.println(ch + ": " + occurrences[ch - 'a']);
            }
        }

            System.out.println("Alphabet with maximum occurrence: " + maxChar + " (" + maxCount + " times)");
        }
    }



