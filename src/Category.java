import java.util.ArrayList;
import java.util.List;

public class Category {
    public String name = "";
    public List<Item> items = new ArrayList<>();

    public void printCategory() {
        System.out.println(name + ": " + items.size());
    }

    public void askTodoItems() {
        // TODO: Implement
    }
}
