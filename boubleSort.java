import java.util.Arrays;

public class boubleSort {
    public static void boubleSortR(int arr[], int n) {
        if (n == 1)
            return;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count += 1;
            }
        }
        if (count == 0) {
            return;
        }
        boubleSortR(arr, n - 1);
    }

    public static void main(String niraj[]) {
        int arr[] = { 5, 1, 6, 2, 4, 3, 7 };
        boubleSortR(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
