package Template;

public class Main {
    public static void main(String[] args) {
        CharDisplay charDisplay = new CharDisplay('H');
        StringDisplay stringDisplay = new StringDisplay("Hello, world.");
        charDisplay.display();
        System.out.println();
        stringDisplay.display();

    }
}
