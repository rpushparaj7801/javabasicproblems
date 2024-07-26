package string;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {

        String  input = "Azure is a Microsoft cloud. Azure is cost efficient";
        System.out.println(input);

        input= input.toLowerCase();


        System.out.print("Enter the string to find: ");
        Scanner scanner = new Scanner(System.in);

        String findword = scanner.nextLine();

        int index = input.indexOf(findword);

        if (index!=-1){
            System.out.println("The string you enter is:  "+findword+"  ,is at index of: "+index);
        }
        else {

            System.out.println("not found");
        }
    }
}
