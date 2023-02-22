package collectionAndStreams;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Writemain {
    public static void main(String[] args) {

        List<Student> studentlist = new ArrayList<>();

        studentlist.add(new Student("Aman", 21, true, 7));
        studentlist.add(new Student("Anmol", 22, false, 10));

        try {
            RecordWriter rw = new RecordWriter("student.text");
            for (Student s : studentlist) {
                System.out.println(s);
                rw.write(s);
            }
            rw.save();
        } catch (IOException e) {
            //
        }
    }
}

class RecordWriter {

    DataOutputStream dataOutput;
    public RecordWriter(String outputfile) throws IOException{
       dataOutput = new DataOutputStream(new FileOutputStream(outputfile));
    }

    void write(Student student) throws IOException{
        dataOutput.writeUTF(student.getName());
        dataOutput.writeInt(student.getAge());
        dataOutput.writeBoolean(student.getGender());
        dataOutput.writeFloat(student.getGrade());
    }

    public void save() throws IOException{
        dataOutput.close();
        System.out.println("data saved");
    }
}