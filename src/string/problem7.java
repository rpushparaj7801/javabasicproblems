package string;

public class problem7 {
    public static void main(String[] args) {
        String s="Hello, have a good day";

        System.out.println("original string: "+s);
        System.out.println("--------------------------");

        s= s.toLowerCase();
        System.out.println(s);

        String res = s.replaceAll("[bcdfghjklmpqrstvwxyz]","");
        System.out.println(res);



        }
        }





