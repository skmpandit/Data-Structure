import java.util.Scanner;

public class CyclicallyRotate2 {
    void Rotate(int arr[], int n) {
        int i = 0, j = n - 1;
        while (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
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
        CyclicallyRotate2 rotate = new CyclicallyRotate2();
        rotate.Rotate(arr, n);
        rotate.PrintArray(arr, n);
    }
}
