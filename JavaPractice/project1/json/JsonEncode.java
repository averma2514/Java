package json;

import java.io.FileWriter;

import org.json.simple.*;

public class JsonEncode {
    public static void main(String[] args) {
        
        JSONObject file = new JSONObject();

        file.put("Name", "Aman");
        file.put("Roll No", Integer.valueOf(221098702));

        System.out.println(file);

        try (FileWriter fw = new FileWriter("../output.json");){
        fw.write(file.toJSONString());
        System.out.println("json file created...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
