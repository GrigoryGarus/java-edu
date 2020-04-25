import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu extends AbstractMenu {

    public MainMenu() {
        super();
        initMenuItems();
    }

    private void initMenuItems() {
        this.items.add("Создать");
        this.items.add("Искать");
        this.items.add("Удалить");
    }

    @Override
    public void interactWithMenu() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            try {
                int choiceNumber = scanner.nextInt();
                System.out.println("Вы ввели " + choiceNumber);
            } catch (InputMismatchException mismatchException) {
                System.out.println("Неправильнный ввод данных. Пожалуйста введите число соотвествующее пункту меню");
                this.printMenu();
            }
        }

        //interactWithMenu();  222:
    }
}
