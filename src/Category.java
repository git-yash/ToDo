import java.util.ArrayList;
import java.util.List;

public class Category {
    public String name = "";
    public List<Item> items = new ArrayList<>();

    public void printCategoryDetail() {
        System.out.println("---------" + name + "----------");
        if (items.size() == 0) {
            System.out.println("No TODO items exist");
        } else {
            for (Item item : items) {
                item.printItem();
            }
        }
        System.out.println("----------------------------");
    }

    public void printCategorySummary(int id) {
        System.out.println(id + ". " + name + ": items(" + items.size() + ")");
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
