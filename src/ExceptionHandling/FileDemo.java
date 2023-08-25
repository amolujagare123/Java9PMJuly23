package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws FileNotFoundException {


            FileInputStream fis = new FileInputStream("D:\\dfdfdf.txt");


        System.out.println("end of the program");
    }
}
