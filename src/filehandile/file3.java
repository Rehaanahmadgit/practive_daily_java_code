package filehandile;

import java.io.FileWriter;
import java.io.IOException;

public class file3 {
    public static void main(String[] args) {
        try {
            FileWriter Writer
                    = new FileWriter("src/filehandile/rehaanfile");
            Writer.write(
                    "Files in Java are seriously good!!");
            Writer.close();
            System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
