package serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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

public class SerializationOutput {
    public static void main(String[] args) {

        Empl e = new Empl("Aman","punjab",132,1005);
        
        try (ObjectOutputStream oss =new ObjectOutputStream(new FileOutputStream(new File("myfile.ser")))){
            oss.writeObject(e);
            oss.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        catch(IOException e1){
            e1.printStackTrace();
        }

    }
}
