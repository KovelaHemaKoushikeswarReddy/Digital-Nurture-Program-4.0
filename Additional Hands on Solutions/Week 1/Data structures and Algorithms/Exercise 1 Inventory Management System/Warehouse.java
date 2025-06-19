import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Warehouse {
    private List<StockItem> items;

    public Warehouse() {
        items = new ArrayList<>();
    }

    public void addItem(StockItem item) {
        items.add(item);
    }

    public void modifyItem(int itemCode, String name, int quantity, double price) {
        boolean located = false;
        for (StockItem item : items) {
            if (item.getItemCode() == itemCode) {
                item.setItemName(name);
                item.setStockCount(quantity);
                item.setCost(price);
                System.out.println("Updated Item ID: " + itemCode);
                located = true;
                break;
            }
        }
        if (!located) {
            System.out.println("Item with ID " + itemCode + " not found.");
        }
    }

    public boolean removeItem(int itemCode) {
        for (StockItem item : items) {
            if (item.getItemCode() == itemCode) {
                items.remove(item);
                System.out.println("Deleted Item ID: " + itemCode);
                return true;
            }
        }
        System.out.println("Item with ID " + itemCode + " not found.");
        return false;
    }

    public void showItems() {
        for (StockItem item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Warehouse warehouse = new Warehouse();

        int itemCode;
        String itemName;
        int stock;
        double price;
        char proceed = 'y';

        while (proceed == 'y') {
            System.out.println("Enter Item Details:");
            System.out.print("Item ID: ");
            itemCode = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Item Name: ");
            itemName = scanner.nextLine();
            System.out.print("Stock Quantity: ");
            stock = scanner.nextInt();
            System.out.print("Item Price: ");
            price = scanner.nextDouble();
            StockItem item = new StockItem(itemCode, itemName, stock, price);
            warehouse.addItem(item);

            System.out.print("Add more items? [y/n]: ");
            proceed = scanner.next().charAt(0);
            System.out.println();
        }

        System.out.println("Inventory List:");
        warehouse.showItems();

        System.out.print("Enter ID to update: ");
        itemCode = scanner.nextInt();
        warehouse.modifyItem(itemCode, "Wireless Headphones", 8, 3799.99);

        System.out.println("After Update:");
        warehouse.showItems();

        System.out.print("Enter ID to delete: ");
        itemCode = scanner.nextInt();
        warehouse.removeItem(itemCode);

        System.out.println("After Deletion:");
        warehouse.showItems();

        scanner.close();
    }
}
