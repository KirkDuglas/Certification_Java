import java.io.FileWriter;

public class sem2_4 {
    public static void main(String[] args) {
        String Result = repeatWord("TEST", 100);
        writeToFile(Result, "Result.txt");
    }
    
    static String repeatWord(String s, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }

    public static void writeToFile(String str, String filename){
        // FileWriter filewriter = null;               
        try (FileWriter fileWriter = new FileWriter(filename)){
                fileWriter.write(str);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

   
         
    //     try {
    //         filewriter = new filewriter(Filename);
    //         filewriter.write(str);
    //     }
    //     catch (Exception e) {
    //         e.printStackTrace();
    //     }
    //         finally {
    //         try{
    //             fileWriter.close();
    //         }
    //         catch (Exception e) {
    //             e.printStackTrace();
    //     }
    // }

}
