package basicproblems;

import java.util.Scanner;

public class lengthofarray {
    public static void main(String[] args) {

String s;
int l;
for (int i=1;i<=5;i++) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");

    s = sc.nextLine();
    l = s.length();
    System.out.println(l);

}
    }
}
