import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
/**
 * Write a description of class

Saver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JsonHandler
{
    private static final String fileLocation = "C:/Users/Frost519/Documents/School/IT327/";

    public static void accountWriteToFile(String myData, String username) {
        File accountFile = new File(fileLocation + username + ".txt");
        if (!accountFile.exists()) {

            try{
                File directory = new File(accountFile.getParent());

                if (!directory.exists()) {
                    // mkdirs(): Creates the directory named by this abstract pathname, including any necessary but nonexistent parent directories.
                    // Note that if this operation fails it may have succeeded in creating some of the necessary parent directories.
                    directory.mkdirs();
                }

                // createNewFile(): Atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist.
                // The check for the existence of the file and the creation of the file if it does not exist are a single operation
                // that is atomic with respect to all other filesystem activities that might affect the file.
                accountFile.createNewFile();

            }catch (IOException e) {
                //crunchifyLog("Exception Occurred: " + e.toString());
            }
        }

        try{
            FileWriter accountWriter;
            accountWriter = new FileWriter(accountFile.getAbsoluteFile(), false);
            // Writes text to a character-output stream
            BufferedWriter bufferWriter = new BufferedWriter(accountWriter);
            bufferWriter.write(myData.toString());
            bufferWriter.close();
            accountWriter.close();

            //System.out.println("Company data saved at file location: " + fileLocation+username + " Data: " + myData + "\n");
        }catch(IOException e){

        }
    }

    public static Account accountReadFromFile(String username){
        File accountFile = new File(fileLocation+username+ ".txt");
        Account User = null;
        if (!accountFile.exists()) {
            System.out.println("File Does not exist");
        }

        InputStreamReader isReader;
        try{
            isReader = new InputStreamReader(new FileInputStream(accountFile), StandardCharsets.UTF_8);
            Gson gson = new Gson();
            JsonReader myReader = new JsonReader(isReader);
            User = gson.fromJson(myReader, Account.class);
            myReader.close();
            isReader.close();
        }catch(IOException e){

        }
        return User;
    }

    public static void deleteAccount(String username){
        File accountFile = new File(fileLocation+username+ ".txt",fileLocation+username+ ".txt");
        if(accountFile.delete()){ 
            System.out.println("Deleted the file: " + fileLocation+username+ ".txt");
        } else {
            System.out.println("Failed to delete the file: "+ fileLocation+username+ ".txt");
        } 
    }
}

