public class Item {
    public boolean isFinished = false;
    public String desc = "";

    public Item(String desc) {
        this.desc = desc;
    }

    public void printItem() {
        System.out.println(this.desc);
    }
}
