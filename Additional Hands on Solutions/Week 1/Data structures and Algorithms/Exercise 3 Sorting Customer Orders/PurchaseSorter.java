import java.util.Scanner;

class Purchase {
    int id;
    String buyer;
    double amount;

    public Purchase(int id, String buyer, double amount) {
        this.id = id;
        this.buyer = buyer;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Purchase ID: " + id + ", Buyer: " + buyer + ", Amount: $" + amount;
    }
}

public class PurchaseSorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.print("How many purchases to enter? ");
        int count = input.nextInt();
        input.nextLine(); // consume newline

        Purchase[] list = new Purchase[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter info for purchase " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Buyer Name: ");
            String buyer = input.nextLine();
            System.out.print("Amount: ");
            double amount = input.nextDouble();
            input.nextLine();

            list[i] = new Purchase(id, buyer, amount);
        }

        System.out.println("\nBefore Sorting:");
        for (Purchase p : list) {
            System.out.println(p);
        }

        applyBubbleSort(list);
        System.out.println("\nSorted Using Bubble Sort:");
        for (Purchase p : list) {
            System.out.println(p);
        }

        applyQuickSort(list, 0, list.length - 1);
        System.out.println("\nSorted Using Quick Sort:");
        for (Purchase p : list) {
            System.out.println(p);
        }

        input.close();
    }

    // Bubble Sort
    public static void applyBubbleSort(Purchase[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j].amount > arr[j + 1].amount) {
                    Purchase temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort Helpers
    public static void switchItems(Purchase[] arr, int a, int b) {
        Purchase temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void applyQuickSort(Purchase[] arr, int start, int end) {
        if (start >= end) return;

        int pivotIndex = (start + end) / 2;
        double pivotValue = arr[pivotIndex].amount;
        switchItems(arr, start, pivotIndex);

        int boundary = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i].amount < pivotValue) {
                boundary++;
                switchItems(arr, boundary, i);
            }
        }

        switchItems(arr, start, boundary);
        applyQuickSort(arr, start, boundary - 1);
        applyQuickSort(arr, boundary + 1, end);
    }
}
