import java.util.Scanner;

// Represents a single work item
class WorkItem {
    int id;
    String title;
    String progress;

    public WorkItem(int id, String title, String progress) {
        this.id = id;
        this.title = title;
        this.progress = progress;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Progress: " + progress;
    }
}

// Linked list node
class WorkNode {
    WorkItem item;
    WorkNode next;

    public WorkNode(WorkItem item) {
        this.item = item;
        this.next = null;
    }
}

// Custom singly linked list
class WorkTracker {
    private WorkNode head;

    public WorkTracker() {
        head = null;
    }

    // Add new task to the list
    public void addWork(WorkItem item) {
        WorkNode newNode = new WorkNode(item);
        if (head == null) {
            head = newNode;
        } else {
            WorkNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Search for a task by ID
    public WorkItem findWork(int id) {
        WorkNode current = head;
        while (current != null) {
            if (current.item.id == id) {
                return current.item;
            }
            current = current.next;
        }
        return null;
    }

    // Display all tasks
    public void showAll() {
        WorkNode current = head;
        while (current != null) {
            System.out.println(current.item);
            current = current.next;
        }
    }

    // Delete task by ID
    public void removeWork(int id) {
        if (head == null) return;

        if (head.item.id == id) {
            head = head.next;
            return;
        }

        WorkNode current = head;
        while (current.next != null && current.next.item.id != id) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }
}

// Main class for testing
public class WorkManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WorkTracker tracker = new WorkTracker();

        System.out.println();
        System.out.print("How many work items do you want to add? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("Enter Work ID:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Title:");
            String title = scanner.nextLine();
            System.out.println("Enter Progress (Started/Finished):");
            String progress = scanner.nextLine();

            tracker.addWork(new WorkItem(id, title, progress));
        }

        System.out.println("\nCurrent Work List:");
        tracker.showAll();

        System.out.print("\nEnter Work ID to search: ");
        int searchId = scanner.nextInt();
        WorkItem result = tracker.findWork(searchId);
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Work not found.");
        }

        System.out.print("\nEnter Work ID to remove: ");
        int removeId = scanner.nextInt();
        tracker.removeWork(removeId);

        System.out.println("\nWork List After Deletion:");
        tracker.showAll();

        scanner.close();
    }
}
