package readfile;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        int i;
        try(FileInputStream fis = new FileInputStream(new File("sample.text"))) {
         
            System.out.println((char)fis.read());

        while ((i=fis.read())!=-1) {
            System.out.print((char)i);
        }

        } catch (IOException e) {
            System.out.println("File not found");

        }
    }
}