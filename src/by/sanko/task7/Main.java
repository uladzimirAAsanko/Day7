package by.sanko.task7;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            System.out.println("1 - англйиский \n2 - белорусский \nлюбой - русский");
            char c = 0;
            try{
                c = (char)System.in.read();
            }catch (IOException e){
                e.printStackTrace();
            }
            String country = "";
            String language = "";
            switch (c) {
                case '1' :
                    country = "US";
                    language = "EN";
                    break;
                case '2' :
                    country = "BY";
                    language = "BE";
                    break;
            }
            Locale current = new Locale(language, country);
            ResourceBundle rb = ResourceBundle.getBundle("datares.text",current);
            String s1 = rb.getString("capital");
            String s2 = rb.getString("president");
            System.out.println(s1);
            System.out.println(s2);
        }
    }
}
