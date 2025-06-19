import java.util.Arrays;

public class CatalogSearch {

    public static void main(String[] args) {
        CatalogItem[] items = {
            new CatalogItem(101, "Python Basics", "Kunal Rao"),
            new CatalogItem(102, "System Design", "Aria Banerjee"),
            new CatalogItem(103, "Machine Learning", "Rehan Kapoor"),
            new CatalogItem(104, "Web Development", "Meera Shah")
        };

        // Linear search
        String query = "System Design";
        CatalogItem resultLinear = linearLookup(items, query);
        System.out.println("Linear Search Result: " + (resultLinear != null ? resultLinear : "Not Found"));

        // Binary search after sorting by title
        Arrays.sort(items, (a, b) -> a.getItemName().compareToIgnoreCase(b.getItemName()));
        CatalogItem resultBinary = binaryLookup(items, query);
        System.out.println("Binary Search Result: " + (resultBinary != null ? resultBinary : "Not Found"));
    }

    // Linear Search Method
    public static CatalogItem linearLookup(CatalogItem[] items, String title) {
        for (CatalogItem item : items) {
            if (item.getItemName().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    // Binary Search Method
    public static CatalogItem binaryLookup(CatalogItem[] items, String title) {
        int left = 0, right = items.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = items[mid].getItemName().compareToIgnoreCase(title);

            if (compare == 0) {
                return items[mid];
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
