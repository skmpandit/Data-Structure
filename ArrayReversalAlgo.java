import java.util.Scanner;

public class ArrayReversalAlgo {
    void reversalAlgo(int arr[], int d, int n) {
        if (d == 0) {
            return;
        }
        d = d % n;
        reversArray(arr, 0, d - 1);
        reversArray(arr, d, n - 1);
        reversArray(arr, 0, n - 1);
    }

    static void reversArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int i, d, arr[], n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the rotate size: ");
        d = sc.nextInt();
        ArrayReversalAlgo rotate = new ArrayReversalAlgo();
        rotate.reversalAlgo(arr, d, n);
        rotate.printArray(arr, n);
    }
}