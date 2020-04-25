import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMenu implements Menu {
    //TODO: Тут вы должны реализовать список элементов меню
    protected ArrayList<String> items;
    protected String MENU_HEADER = "Пожалуйста введите необходимый номер пункта меню:";

    public AbstractMenu() {
        this.items = new ArrayList<>();
    }

    private void printMenuHeader() {
        System.out.println(MENU_HEADER);
    }

    @Override
    public void printMenu() {
        //TODO: Тут необходимо реализовать вызов методов элементов меню
        printMenuHeader();

        for (int i = 1; i <items.size() ; i++) {
            String printMenuItems = i + " - "+ items.get(i-1);
            System.out.println(printMenuItems);

        }

    }
}
