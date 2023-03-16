import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
class magic{
    public static void main(String[] args) {
        String path = "C:\\Users\\amanv\\oneDrive\\Desktop\\";
        for(int i=1;i<2;i++){
            File file = new File(path+""+i+".text");
            try{
                file.createNewFile();
            }catch (IOException e){}
    }
}
}
//C:\Users\amanv\OneDrive\Desktop