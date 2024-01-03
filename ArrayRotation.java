public class ArrayRotation {
    public static void leftRotate(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }

    public static void rightRotate(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("Original Array:");
        printArray(arr);
        leftRotate(arr);
        System.out.println("Left Rotated Array:");
        printArray(arr);

       
        rightRotate(arr);
        System.out.println("Right Rotated Array:");
        printArray(arr);
    }
}
