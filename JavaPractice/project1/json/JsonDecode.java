package json;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonDecode {
    public static void main(String[] args) {
        
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("output.json"));
            JSONObject jsonObject = (JSONObject)obj;

            System.out.println(jsonObject.get("Name"));

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
