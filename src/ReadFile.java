import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

public class ReadFile {
    public String readfile(String filename){
        StringBuilder content = new StringBuilder();
        try{
            File myObj = new File(filename);
            Scanner reader = new Scanner(myObj);
            while(reader.hasNextLine()){
                content.append(reader.nextLine()).append('\n');
            }
            reader.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        return content.toString();
    }
}
