public enum EditOptions {
    CATEGORY_NAME(1),
    TODO_DESC(2),
    TODO_FINISHED_STATUS(3),
    TODO_REMOVE(4);

    private final int option;

    EditOptions(int option) {
        this.option = option;
    }

    public int getLevelCode() {
        return this.option;
    }

    public static void printViewOptions(boolean hasItems) {
        System.out.println("Enter " + EditOptions.CATEGORY_NAME.getLevelCode() + " to edit category name");

        if (hasItems) {
            System.out.println("Enter " + EditOptions.TODO_DESC.getLevelCode() + " to edit item description");
            System.out.println("Enter " + EditOptions.TODO_FINISHED_STATUS.getLevelCode() + " to change item status");
            System.out.println("Enter " + EditOptions.TODO_REMOVE.getLevelCode() + " to remove an item");
        }
    }

    public static int getMaxOptions(boolean hasItems) {
        return hasItems ? 4 : 1;
    }
}
