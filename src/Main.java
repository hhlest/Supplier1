
public class Main {
    public static void main(String[] args) {
        String str = "Hello java hello world";
        StringForSupplier supStr = new StringForSupplier(str);
        for (int i = 0; i < supStr.amountOfWords(); i++) {
            System.out.println(supStr.get());
        }
    }
}

