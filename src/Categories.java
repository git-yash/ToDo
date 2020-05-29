import java.util.ArrayList;
import java.util.List;

public class Categories {
    private List<Category> categories = new ArrayList<>();

    public int getCount() {
        return this.categories.size();
    }

    public boolean hasCategories() {
        return getCount() > 0;
    }


    public void printCategories() {
        System.out.println();
        System.out.println("---------Categories----------");
        if (categories.size() == 0) {
            System.out.println("You have no categories");
            return;
        }

        for (int i = 0; i < categories.size(); i++) {
            categories.get(i).printCategorySummary(i + 1);
        }

        System.out.println("----------------------------");
    }

    public void editCategory() {
        Category category = this.gatherCategory("edit");
        category.printCategoryDetail();
        EditOptions.printViewOptions(category.hasTodoItems());

        int maxCount = EditOptions.getMaxOptions(category.hasTodoItems());
        int userInput = GatherInput.gatherIntInput("Enter an option: ", maxCount, 1);

        if (userInput == EditOptions.CATEGORY_NAME.getLevelCode()) {
            category.name = GatherInput.gatherStringInput("Enter name: ", true);
        } else if (userInput == EditOptions.TODO_DESC.getLevelCode()) {
            Item item = category.gatherTodoItem("edit");
            item.desc = GatherInput.gatherStringInput("Enter description: ", true);
        } else if (userInput == EditOptions.TODO_FINISHED_STATUS.getLevelCode()) {
            Item item = category.gatherTodoItem("edit");
            item.isFinished = GatherInput.gatherBooleanInput("Is finished?");
        } else {
            Item item = category.gatherTodoItem("remove");
            category.removeTodoItem(item);
        }
    }

    public void addCategory() {
        Category category = new Category();
        category.name = GatherInput.gatherStringInput("Category name: ", true);
        boolean shouldAddTodoItems = GatherInput.gatherBooleanInput("Do you want to add TODO items?");
        if (shouldAddTodoItems) {
            category.askTodoItems();
        }
        categories.add(category);
    }

    public void removeCategory() {
        Category category = this.gatherCategory("remove");
        categories.remove(category);
    }

    public void viewCategory() {
        Category category = gatherCategory("view");
        category.printCategoryDetail();
    }

    private int gatherCategoryIndex(String action) {
        return GatherInput.gatherIntInput("Which category would you like to " + action + "?: ", getCount(), 1);
    }

    private Category gatherCategory(String action) {
        int categoryIndex = this.gatherCategoryIndex(action);
        return categories.get(categoryIndex - 1);
    }
}
