import java.util.*;

public class Main {
    public static void main(String[] args) {
        Backpack myBackpack = new Backpack();
        myBackpack.open();

        Weapon sword = new Weapon("Sword", 15);
        Food apple = new Food("Green Apple", 10);
        QuestItem key = new QuestItem("Silver Key");
        Projectile shuriken = new Projectile("Shuriken", 5);

        myBackpack.addItem(sword);
        myBackpack.addItem(apple);
        myBackpack.addItem(key);
        myBackpack.addItem(shuriken);

        myBackpack.showInventory();

        sword.stats();

        sword.use();
        shuriken.use();

        myBackpack.removeItem("Green Apple");
        myBackpack.showInventory();

    }
}
