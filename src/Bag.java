import java.util.*;

abstract class Bag {

    // Variables
    protected HashMap<String, Item> items = new HashMap<>();
    int maxItems;
    String bagType;

    // Constructor
    public Bag (String bagType, int maxItems) {
        this.bagType = bagType;
        this.maxItems = maxItems;
    }

// Methods

    public void addItem(Item item) {
        if (items.size() < maxItems) {
            items.put(item.name, item);
            System.out.println("Added " + item.name + " to " + bagType);
        } else {
            System.out.println(bagType + " is full");
        }
    }
    public void removeItem(String itemName) {
        if (items.containsKey(itemName)) {
            items.remove(itemName);
            System.out.println("Removed " + itemName + " from " + bagType);
        } else {
            System.out.println(itemName + " not found in " + bagType);
        }
    }

    public void showInventory() {
        System.out.println("--- " + bagType + " Inventory ---");
        if (items.isEmpty()) {
            System.out.println("The bag is empty");
        } else {
            for (Item item : items.values()) {
                System.out.println("- " + item.name + " |" + item.itemType + "|");
            }
        }
    }

    public abstract void open();

}

class Backpack extends Bag {
    public Backpack() { super("Backpack", 10); }
    public void open() {
        System.out.println("You unzip your backpack.");
    }
}

class Satchel extends Bag {
    public Satchel() { super("Satchel", 5); }
    public void open() {
        System.out.println("You undo the main flap of the leather satchel.");
    }
}

