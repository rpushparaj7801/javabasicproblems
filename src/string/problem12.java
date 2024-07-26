package string;

import javax.lang.model.element.NestingKind;
import java.util.Arrays;

public class problem12 {
    public static void main(String[] args){

        String s1="earth";
        String s2="heart";

       s1= s1.toLowerCase();
       s2= s2.toLowerCase();


        if (s1.length()!=s2.length()){

            System.out.println("not anagram");
        }

        else  {

           char[]string1= s1.toCharArray();
            char[]string2= s2.toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);

            if(Arrays.equals(string1, string2) == true) {
                System.out.println("Both the strings are anagram");
            }
            else {
                System.out.println("Both the strings are not anagram");
            }
        }
    }
}
