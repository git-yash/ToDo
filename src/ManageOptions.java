public enum ManageOptions {
    EXIT(0),
    ADD(1),
    EDIT(2),
    REMOVE(3),
    VIEW(4);

    private final int option;

    ManageOptions(int option) {
        this.option = option;
    }

    public int getLevelCode() {
        return this.option;
    }

    public static void printOptions(boolean hasCategories) {
        System.out.println("Enter " + ManageOptions.EXIT.getLevelCode() + " to exit");
        System.out.println("Enter " + ManageOptions.ADD.getLevelCode() + " to add a category");

        if (hasCategories) {
            System.out.println("Enter " + ManageOptions.EDIT.getLevelCode() + " to edit a category");
            System.out.println("Enter " + ManageOptions.REMOVE.getLevelCode() + " to remove a category");
            System.out.println("Enter " + ManageOptions.VIEW.getLevelCode() + " to view a category");
        }
    }

    public static int getMaxOptions(boolean hasCategories) {
        return hasCategories ? 4 : 1;
    }

}
