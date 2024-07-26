package dummy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {

        String mobile= "8122803119";
        Pattern p = Pattern.compile("[6-9][0-9]{10}");
        Matcher m = p.matcher(mobile);

        if (m.find()){
            System.out.println(m.group()+ " is valid mobile number");
        }
        else{
            System.out.println("invalid mobile number");
        }





//        String s = "hitaaahisispushparaj";
//        Pattern p = Pattern.compile("dummy.dummy.a{1}");
//        Matcher m = p.matcher(s);
//
//
//        while (m.find()){
//            System.out.println(m.group() +" "+m.start());
//        }


        }
    }

