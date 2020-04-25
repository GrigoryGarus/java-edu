import java.util.ArrayList;

//TODO: Тут необходимо реализовать класс отвечающий описанию элементов меню
public class MenuItem extends AbstractMenu {

    private String name;
    private int id;

    public MenuItem(String name) {
        this.name = name;
        this.id = items.size()+1;
    }
    public void printM (){
        System.out.println(this.id+ " - "+this.name);
    }

    @Override
    public void interactWithMenu() {

    }
}