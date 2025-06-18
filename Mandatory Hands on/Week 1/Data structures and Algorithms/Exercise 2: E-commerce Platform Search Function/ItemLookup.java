import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Renamed Product to Item
class Item {
    int id;
    String name;
    String type;

    public Item(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item ID: " + id + ", Title: " + name + ", Type: " + type;
    }
}

public class ItemLookup {

    // Linear search function
    public static Item findItemLinear(Item[] itemList, int keyId) {
        for (Item item : itemList) {
            if (item.id == keyId) {
                return item;
            }
        }
        return null;
    }

    // Binary search function
    public static Item findItemBinary(Item[] itemList, int keyId) {
        int low = 0;
        int high = itemList.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (itemList[middle].id == keyId) {
                return itemList[middle];
            } else if (itemList[middle].id < keyId) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();

        // Ask user how many items they want to store
        System.out.print("How many items would you like to add? ");
        int totalItems = input.nextInt();
        input.nextLine(); // Clear input buffer

        Item[] items = new Item[totalItems];

        // Accept details for each item
        for (int i = 0; i < totalItems; i++) {
            System.out.print("ID for item " + (i + 1) + ": ");
            int itemId = input.nextInt();
            input.nextLine(); // Clear buffer

            System.out.print("Name of item " + (i + 1) + ": ");
            String itemName = input.nextLine();

            System.out.print("Type of item " + (i + 1) + ": ");
            String itemType = input.nextLine();

            items[i] = new Item(itemId, itemName, itemType);
        }

        // Ensure the list is sorted for binary search
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item one, Item two) {
                return Integer.compare(one.id, two.id);
            }
        });

        // Prompt user for the ID they want to look for
        System.out.print("Enter the ID of the item to look up: ");
        int targetId = input.nextInt();

        // Perform linear lookup
        Item resultLinear = findItemLinear(items, targetId);
        if (resultLinear != null) {
            System.out.println("Located via Linear Lookup: " + resultLinear);
        } else {
            System.out.println("No matching item found using Linear Lookup.");
        }

        // Perform binary lookup
        Item resultBinary = findItemBinary(items, targetId);
        if (resultBinary != null) {
            System.out.println("Located via Binary Lookup: " + resultBinary);
        } else {
            System.out.println("No matching item found using Binary Lookup.");
        }

        input.close();
    }
}
