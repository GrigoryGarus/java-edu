import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu extends AbstractMenu {

    public MainMenu() {
        super();
        initMenuItems();
    }

    private void initMenuItems() {
//TODO: Тут вы должны реализовать возможность заполнения списка элементов меню
        this.items.add("Создать");
    }

    @Override
    public void interactWithMenu() {
//TODO: Тут вам необходимо реализовать считывание элемента меню, а так же проверку вводного элемента
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        if (choice.matches("[^a-zA-Z0-9 ]")){
            System.out.println("Ошибка. Повторите ввод");
            printMenu();
            interactWithMenu();
        }
    }
}
