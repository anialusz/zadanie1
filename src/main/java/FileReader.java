import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public List<byte[]> parseFile(String filename) {

        List<byte[]> listOfAllObjects = new ArrayList<>();

        try {
            InputStream inputstream = new FileInputStream(filename);

            byte[] data = inputstream.readNBytes(8);
            while (data.length > 0) {
                listOfAllObjects.add(data);
                data = inputstream.readNBytes(8);
            }
            inputstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listOfAllObjects;
    }
}