package filehandile;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.*;

public class file1 {
    public static void main(String[] args) throws IOException {

        BufferedReader input=null;
    char []arr=new char[30];
    try{
        FileReader file=new FileReader("src/filehandile/rehaanfile");
     input =new BufferedReader(file);
        input.read(arr);
        System.out.println(arr);

    }
    catch(IOException e )
    {
        System.out.println(e);

    }finally {
        input.close();
    }
    }
}
