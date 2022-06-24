import java.util.Scanner;

public class CyclicallyRotate {
    void Cyclically(int arr[], int n) {
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    void PrintArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        CyclicallyRotate rotate = new CyclicallyRotate();
        rotate.Cyclically(arr, n);
        rotate.PrintArray(arr, n);
    }
}
