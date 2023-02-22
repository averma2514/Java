package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

class Empl implements java.io.Serializable {
    private String name;
    private String address;
    private int ssn;
    private int number;

    public Empl(String name, String address, int ssn, int number) {
        this.name = name;
        this.address = address;
        this.ssn = ssn;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Empl [name=" + name + ", address=" + address + ", ssn=" + ssn + ", number=" + number + "]";
    }

}

public class SerializationInput {
    public static void main(String[] args) throws IOException {

        
        try (ObjectInputStream ois =new ObjectInputStream(new FileInputStream("myfile.ser"))){
            
            Empl temp = (Empl) ois.readObject();

            System.out.println(temp.getAddress());
            System.out.println(temp.getName());
            System.out.println(temp.getNumber());
            System.out.println(temp.getSsn());
            System.out.println("serialization DOne...");
            
            

            System.out.println("serialization Done...");
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        catch(ClassNotFoundException e1){
            e1.printStackTrace();
        }

    }
}
