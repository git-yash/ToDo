import java.util.ArrayList;
import java.util.List;

public class Category {
    public String name = "";
    public List<Item> items = new ArrayList<>();

    public void printCategory() {
        System.out.println(name + ": " + items.size());
    }

    public void askTodoItems() {
        String toDo = GatherInput.gatherStringInput("What would you like to add?: ", true);
        items.add(new Item(toDo));
        boolean addAnother = GatherInput.gatherBooleanInput("Would you like to add another?: ");
        if (addAnother) {
            askTodoItems();
        }
    }
}
