package java_nobase;

import java.io.*;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileReader fr = new FileReader(".\\test.txt");

        p.load(fr);
        fr.close();

        String count = p.getProperty("count");
        int i = Integer.parseInt(count);
        if (i >= 3) {
            System.out.println("end");
        } else {
            System.out.println("wan");
            i++;
            p.setProperty("count", String.valueOf(i));
            FileWriter fw = new FileWriter(".\\test.txt");
            p.store(fw, null);
            fw.close();
        }
    }

}

