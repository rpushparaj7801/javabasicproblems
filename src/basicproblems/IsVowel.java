package basicproblems;

import java.util.Scanner;

public class IsVowel {
    public static void main(String[] args){
        Scanner v = new Scanner(System.in);
        System.out.println("enter the character: ");
        char c = v.next().charAt(0);

        boolean isvowel = false;

        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':    isvowel=true;




        }
        if (isvowel) {
            System.out.println(c + " is vowel");
        }else {
            System.out.println(c +" is not vowel");
        }


        }

    }

