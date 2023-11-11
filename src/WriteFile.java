import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
public class WriteFile {
    public void writefile(String filename, String smth){
        try{
            FileWriter writer = new FileWriter(filename, true);
            writer.write(smth);
            writer.close();

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
