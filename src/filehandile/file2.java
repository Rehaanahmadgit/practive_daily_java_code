package filehandile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class file2 {
    public static void main(String[] args) {



        try {
            File Obj = new File("src/filehandile/rehaanfile");
            Scanner Reader = new Scanner(Obj);
//            Iterator<Integer> itr = Reader.useRadix();

            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
}}
