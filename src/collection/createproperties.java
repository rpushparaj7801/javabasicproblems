package collection;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class createproperties {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.setProperty("name","pushparaj");
        p.setProperty("email","rpushparaj7801@gmail.com");

        p.store(new FileWriter("info.properties"),"javatpoint");
    }
}
