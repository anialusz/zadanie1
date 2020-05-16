import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class BitCustomObject {

    private String message;
    private boolean isObjectCorrect;

    public BitCustomObject(String msg) {
        this.message = msg;
        this.isObjectCorrect = checkIfObjectIsCorrect(msg);
    }

    public boolean isObjectCorrect() {
        return isObjectCorrect;
    }

    @Override
    public String toString() {
        return message;
    }

    private boolean checkIfObjectIsCorrect(String object) {
        int sumOfAllNumbers = 0;
        for (int i = 0; i < object.length(); i++) {
            sumOfAllNumbers += convertLetterToInt(object, i);
        }

        if (sumOfAllNumbers == 0) {
            return false;
        }

        return ((convertLetterToInt(object, 3) == 0 && convertLetterToInt(object, 7) == 0) ||
                (convertLetterToInt(object, 3) == 1 && (convertLetterToInt(object, 7) == 1)));
    }

    private int convertLetterToInt(String object, int index) {
        return Integer.parseInt(object.substring(index, index + 1));
    }
}