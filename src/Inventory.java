
import java.util.ArrayList;

/**
 *
 * @author Ben Spenciner
 */
public class Inventory {

    private static ArrayList<Item> inventory = new ArrayList<>();

    public static void addItem(Item item) {
        inventory.add(item);
    }

    public static void dropItem(Item item) {
        inventory.remove(item);
    }

    public static int equipItem(Item item) {
        if (item instanceof Weapon) {
            return 0;
        } else {
            return 1;
        }
    }
    public static String printInventory(){
        return inventory.toString();
    }
}
