import java.util.Arrays;

public class Class {
    int number;
    String words;
    int[] massive;
    public Class (int number, String words, int[] massive){
        this.number = number;
        this.words = words;
        this.massive = massive;
    }

    @Override
    public String toString() {
        return "Class" +
                "\nnumber: " + number +
                "\nwords: " + words +
                "\nmassive: " + Arrays.toString(massive);
    }
}
