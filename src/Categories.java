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
        System.out.println("---------Categories----------");
        System.out.println();
        if (categories.size() == 0) {
            System.out.println("You have no categories");
            return;
        }

        for (Category category : categories) {
            category.printCategory();
        }
    }

    public void editCategory() {
        Category category = this.gatherCategoryIndex();
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
        Category category = this.gatherCategoryIndex();
        categories.remove(category);
    }

    public void viewCategory() {
        // TODO: Implement
    }

    private Category gatherCategoryIndex() {
        int categoryIndex = GatherInput.gatherIntInput("Which category would you like to edit?: ", getCount(), 1);
        return categories.get(categoryIndex - 1);
    }
}
