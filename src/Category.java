import java.util.ArrayList;
import java.util.List;

public class Category {
    public String name = "";
    public List<Item> items = new ArrayList<>();

    public void printCategory() {
        this.printCategory(0);
    }

    public void printCategory(int id) {
        String indexString = id == 0 ? "" : id + ". ";
        System.out.println(indexString + name + ": items(" + items.size() + ")");
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
