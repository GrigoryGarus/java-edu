import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu extends AbstractMenu {

    public MainMenu() {
        super();
        initMenuItems();
    }

    private void initMenuItems() {
        this.items.add("Create");
        this.items.add("Search");
        this.items.add("Delete");
    }

    @Override
    public void interactWithMenu() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            try {
                int choiceNumber = scanner.nextInt();
                System.out.println("Your input " + choiceNumber);
            } catch (InputMismatchException mismatchException) {
                System.out.println("Invalid input data");
                this.printMenu();
            }
        }
    }
}
