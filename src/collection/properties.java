package collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

import java.util.Properties;

public class properties {
    public static void main(String[] args) throws IOException {

        FileReader f1 = new FileReader("info.properties");
        Properties p = new Properties();
        p.load(f1);

        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("email"));
    }
}
