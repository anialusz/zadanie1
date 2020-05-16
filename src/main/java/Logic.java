import java.util.ArrayList;
import java.util.List;

public class Logic {

    public String getAllInformation(String filename) {
        FileReader fileReader = new FileReader();

        List<BitCustomObject> allObjectsList = convertByteListToObjectList(fileReader.parseFile(filename));

        return getNumberOfAllObjects(allObjectsList) + "\n"
                + getNumberOFFaultyObjects(allObjectsList) + "\n"
                + createListOfCorrectObjects(allObjectsList).toString();
    }


    public int getNumberOFFaultyObjects(List<BitCustomObject> allObjects) {
        if (allObjects != null) {
            int numberOfFaultyObjects = 0;
            for (BitCustomObject bitObject : allObjects) {
                if (!bitObject.isObjectCorrect()) {
                    numberOfFaultyObjects++;
                }
            }
            return numberOfFaultyObjects;
        } else {
            return 0;
        }
    }

    public int getNumberOfAllObjects(List<BitCustomObject> allObjects) {
        if (allObjects != null) {
            return allObjects.size();
        } else {
            return 0;
        }
    }

    public List<BitCustomObject> createListOfCorrectObjects(List<BitCustomObject> allObjects) {
        List<BitCustomObject> correctObjects = new ArrayList<>();
        for (BitCustomObject bitObject : allObjects) {
            if (bitObject.isObjectCorrect()) {
                correctObjects.add(bitObject);
            }
        }
        return correctObjects;
    }

    private List<BitCustomObject> convertByteListToObjectList(List<byte[]> allByteObjects) {
        List<BitCustomObject> allObjectsList = new ArrayList<>();
        for (byte[] b : allByteObjects) {
            String message = new String(b);
            allObjectsList.add(new BitCustomObject(message));
        }
        return allObjectsList;
    }
}