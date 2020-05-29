public class Item {
    public boolean isFinished = false;
    public String desc = "";

    public Item(String desc) {
        this.desc = desc;
    }


    public void printItem() {
        String status = isFinished ? "X" : "-";
        System.out.println(status + " " + desc);
    }
}
