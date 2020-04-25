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
        Scanner scan = new Scanner(System.in);
       if (scan.hasNext()) {
           try {
               int choice = scan.nextInt();
               System.out.println("Ввод прошел.");

           } catch (InputMismatchException | IOException e) {
               System.out.println("Введите число из списка.");
               printMenu();
           }
       }

        //interactWithMenu();
    }
}
