import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
class magic{
    public static void main(String[] args) {
        String path = "..\\";
        for(int i=1;i>0i++){
            File file = new File(i+".text");
            try{
                file.createNewFile();
            }catch (IOException e){}
    }
}
}
//C:\Users\amanv\OneDrive\Desktop
