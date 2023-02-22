package collectionAndStreams;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Readmain {
    
    public static void main(String[] args) {
        
       try {
            readstudent reader = new readstudent("student.text");
 
            List<Student> listStudent = new ArrayList<>();
            listStudent = reader.readall();
 
            int count=0;
            for (Student student : listStudent) {
                System.out.println("----------Details of "+ ++count +" student----------");
                System.out.println("Name : "+student.getName() + "\t");
                System.out.println("Age : "+student.getAge() + "\t");
                System.out.println("Gender : "+student.getGender() + "\t");
                System.out.println("Gender : "+student.getGrade());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        
    }

}

class readstudent{
    DataInputStream datainput;

    public readstudent(String fileinput) throws  FileNotFoundException {
        datainput = new DataInputStream(new FileInputStream(fileinput));
    }
    
    public List<Student> readall() throws IOException{
        List<Student> list = new ArrayList<>();
        try {
            while (true) {
                String name = datainput.readUTF();
                int age = datainput.readInt();
                boolean gender = datainput.readBoolean();
                float grade = datainput.readFloat();
 
                Student student = new Student(name, age, gender, grade);
                list.add(student);
            }
        } catch (EOFException ex) {
            // reach end of file
        }
        datainput.close();
        return list;
    }
}