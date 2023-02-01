package Seminar.Seminar2;

import java.io.FileWriter;

public class Task3 {
    public static void main(String[] args) {
        String text = "TEXT";
        try {
            // FileReader flread = new FileReader("file.txt");
            FileWriter writer = new FileWriter("file.txt");
            for (int i = 0; i < 100; i++) writer.write(text);
            System.out.println("Ok");
            writer.close();
        } catch (Exception e) {
            System.out.println("Wrong");
        }
    }
}
