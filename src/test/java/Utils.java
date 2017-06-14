import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;

/**
 * Created by Subham Rakshit on 12/06/2017.
 */

public class Utils {
    public static String getJson(String fileName){
        JSONParser parser = new JSONParser();
        Object obj = new Object();
        try {
            String filePath = new File("").getAbsolutePath();
            obj = parser.parse(new FileReader(filePath + "/test_data/" + fileName + ".json"));
        }catch (Exception ex){
            //TODO: Need to log to logger.
        }
        return obj.toString();
    }
}
