import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {

    public void saveToFIle(String dataToSave) {
        try (PrintWriter out = new PrintWriter("output.txt")) {
            out.println(dataToSave);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}