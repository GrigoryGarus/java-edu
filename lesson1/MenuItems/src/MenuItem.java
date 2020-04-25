import java.awt.*;
import java.util.ArrayList;

//TODO: Тут необходимо реализовать класс отвечающий описанию элементов меню
public class MenuItem {

    private String name;
    private int id;

    public MenuItem(ArrayList items, String name) {
        this.name = name;
        this.id = items.size() +1;
    }
    public void printM (){
        System.out.println(this.id+ " - "+this.name);
    }


}