import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String niraj[]) {
        int[] arr = { 10, 20, 30, 40, 0, 0, 0, 0, 0, 0 }; // Initialize an array of size 10 with the initial values

        // Traverse the array and display the elements
        System.out.println("Array elements:");
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        // Read a number from the user
        System.out.print("Enter a number to insert into the array: ");
        int numberToInsert = scanner.nextInt();

        // Check if the array is already full
        boolean isFull = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                isFull = false;
                break;
            }
        }

        if (isFull) {
            System.out.println("Array is already full. Cannot insert more elements.");
        } else {
            // Find the index to insert the number to maintain sorted order
            int indexToInsert = 0;
            while (indexToInsert < 4 && arr[indexToInsert] < numberToInsert) {
                indexToInsert++;
            }

            // Shift elements to the right to make space for the new number
            for (int i = arr.length - 1; i > indexToInsert; i--) {
                arr[i] = arr[i - 1];
            }
            // Insert the number
            arr[indexToInsert] = numberToInsert;

            // Display the updated array
            System.out.println("Updated array elements:");
            for (int i = 0; i < 5; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        scanner.close();
    }
}
