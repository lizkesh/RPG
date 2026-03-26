import java.util.*;

abstract class Item {
    String name;
    String description;
    String itemType;
    double weight;
    boolean usable;

    public Item(String name, String description, double weight, boolean use, String itemType) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.usable = usable;
        this.itemType = itemType;
    }

    public abstract void use();

    public void stats() {
        System.out.println("| " + name + " | " + description + "\n" + "Weight : " + weight + "\n" + "Type : " + itemType + "\n");
    }

    public void drop() {
        System.out.println("Successfully Dropped " + name + ".");
    }

    public void inspect() {
        System.out.println("You look ahead of you and find " + name + ". It has quite unique to anything you haven't seen before of its kind.");
    }

}

class Weapon extends Item {
    int damage;
    public Weapon(String name, int damage) {
        super(name, "A pointy and sharp edge to defend yourself", 10.0, true, "Weapon");
        this.damage = damage;
    }
    public void use() {
        System.out.println("You attack with the " + name + " giving " + damage + " xp damage!");
    }
}

class Food extends Item {
    int healValue;
    public Food(String name, int healValue) {
        super(name, "Smells amazing and delicious!", 1.0, true, "Food");
        this.healValue = healValue;
    }
    public void use() {
        System.out.println("You consume the " + name + " and gain " + healValue + " HP!");
    }
}

class Projectile extends Item {
    int quantity;
    public Projectile(String name, int quantity) {
        super(name, "Small and aerodynamic, quick to pierce your enemy", 0.1, true, "Projectile");
        this.quantity = quantity;
    }
    public void use() {
        if (quantity > 0) {
            quantity--;
            System.out.println("You threw a " + name + "! Remaining: " + quantity);
        } else {
            System.out.println("You are out of " + name + "s!");
        }
    }
}

class QuestItem extends Item {
    public QuestItem(String name) {
        super(name, "A mysterious key.", 0.2, false, "Quest Item");
    }
    public void use() {
        System.out.println("This item cannot be used directly. Look for a chest or lock to use it");
    }
}
