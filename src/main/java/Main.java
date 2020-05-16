public class Main {

    public static void main(String[] args) {
        Logic logic = new Logic();
        FileWriter fileWriter = new FileWriter();
        fileWriter.saveToFIle(logic.getAllInformation("input.txt"));

    }
}