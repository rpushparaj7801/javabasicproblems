package string;

import java.util.Arrays;

public  class problem2 {
    public static void main(String[] args) {
        String[] a = {"geeksforgeeks", "geeks", "geek", "geezer"};

        int size = a.length;
        Arrays.sort(a);
        int end = Math.min(a[0].length(), a[size - 1].length());

        int i = 0;
        while (i < end && a[0].charAt(i) == a[size - 1].charAt(i))
            i++;

        System.out.println(a[0].substring(0, i));
    }

}
