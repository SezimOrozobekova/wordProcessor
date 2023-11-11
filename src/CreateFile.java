import java.io.File;  // Import the File class
import java.io.IOException;
public class CreateFile {
    public void createfile(String filename){
        try{
            File myObj = new File(filename);
            if(myObj.createNewFile()){
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exist");
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

}
