import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StudentInfoReader{
    public static void main(String[] args){
        try(FileReader reader = new FileReader("student.txt")){
            int character;
            while((character = reader.read()) != -1){   //If there are no more characters to read, it returns -1
                System.out.print((char) character); //type cast
            }
        } catch(FileNotFoundException e){
            System.out.println("Error: student.txt not found.");
        } catch(IOException e){
            System.out.println("Error: Unable to read the file.");
        }
    }
}