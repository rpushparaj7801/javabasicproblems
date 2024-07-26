package oops;

class mathoperation {
    public static int multiplication(int a, int b) {
        return a * b;

    }
    public static int multiplication(int a,int b,int c){
        return a*b*c;

    }
}

public class methodoverloading {
    public static void main(String[] args) {

        System.out.println(mathoperation.multiplication(4,4));
        System.out.println(mathoperation.multiplication(4,4,1));

    }
}
