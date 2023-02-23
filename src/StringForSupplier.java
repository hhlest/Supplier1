import java.util.function.Supplier;

public class StringForSupplier implements Supplier<String> {
    private String str;
    private int index = 0;

    public StringForSupplier() {
    }

    public StringForSupplier(String str) {
        this.str = str;
    }

    public String[] createArrayFromString() {
        return str.split(" ");
    }

    public int amountOfWords() {
        return str.split(" ").length;
    }

    @Override
    public String get() {
        String[] stringArray = str.split(" ");
        if (index == stringArray.length) {
            index = 0;
        }
        index++;
        return stringArray[index-1];
    }

    @Override
    public String toString() {
        return "StringForSupplier{" +
                "str='" + str + '\'' +
                ", index=" + index +
                '}';
    }
}
