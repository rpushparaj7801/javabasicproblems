package dummy;

import java.util.StringTokenizer;

public class stringtokenizer {
    public static void main(String[] args) {


        StringTokenizer st = new StringTokenizer("hi this.is.pushparaj",".");

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());


        }
    }
}
