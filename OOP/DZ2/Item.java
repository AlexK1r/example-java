package OOP.DZ2;

public class Item extends BaseItem {

    public Item(String name) {
        this.description = name;
    }

    public String getName() {
        return description;
    }
}