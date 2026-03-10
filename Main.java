import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
            arr2[i] = arr1[i]; // Copy array for recursive sorting
        }
        
        // Display original array
        System.out.println("Original array:");
        printArray(arr1);
        
        // Sort and display sorted array (Iterative)
        insertionSortIterative(arr1);
        System.out.println("Sorted array (Iterative):");
        printArray(arr1);
        
        // Sort and display sorted array (Recursive)
        insertionSortRecursive(arr2, n);
        System.out.println("Sorted array (Recursive):");
        printArray(arr2);
        
        scanner.close();
    }

  // Iterative insertion sort method
    public static void insertionSortIterative(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            int start = arr[i];
            int q = i - 1;

            while (q >= 0 && arr[q] > start){
                arr[q+1] = arr[q];
                q--;
            }
            arr[q + 1] = start;
        }
    }

    // Recursive insertion sort method
    public static void insertionSortRecursive(int[] arr, int n) {
        n--;
        if (n >= 0){
            insertionSortRecursive(arr, n);
            int start = arr[n];
            int q = n - 1;
            while (q >= 0 && arr[q] > start){
                arr[q+1] = arr[q];
                q--;
            }
            arr[q + 1] = start;
        }
    }

    // Method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
