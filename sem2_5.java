import java.io.IOException;

import java.io.File;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
// import java.io.IOException;
import java.util.logging.SimpleFormatter;


public class sem2_5 {
    static Logger logger = Logger.getLogger(sem2_5.class.getName());
    public static void main(String[] args) {
        writeArrayToFile(getContentFolder("."), ".");
        getLog();
    }
    
    public static String[] getContentFolder(String folderName) {
        File folder = new File(folderName);
        return folder.list();
    }

    public static void writeArrayToFile(String[] arr, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            if (arr == null)
                return;
            for (int i = 0; i < arr.length; i++) {

                fileWriter.write(arr[i]);
                fileWriter.write(System.lineSeparator());

            }
        } catch (IOException e) {
            logger.log(Level.WARNING, e.Message())
        }
    }

    public static void getLog() {
        try {
            FileHandler filehandler = new FileHandler ("Log.txt");
            logger.addHAndler(fileHandler);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            filehandler.setFormater(simpleFormatter);
        }
        catch (Exception e);


    }
}
