public class ManageToDo {
    private Categories categories = new Categories();

    public void askOptions() {
        ManageOptions.printOptions(categories.hasCategories());

        int maxCount = ManageOptions.getMaxOptions(categories.hasCategories());
        int userInput = GatherInput.gatherIntInput("Enter an option: ", maxCount, 0);
        if (userInput == ManageOptions.EXIT.getLevelCode()) {
            System.exit(0);
        } else if (userInput == ManageOptions.ADD.getLevelCode()) {
            categories.addCategory();
        } else if (userInput == ManageOptions.EDIT.getLevelCode()) {
            categories.editCategory();
        } else if (userInput == ManageOptions.REMOVE.getLevelCode()) {
            categories.removeCategory();
        } else {
            categories.viewCategory();
        }
        categories.printCategories();
        askOptions();
    }


}
