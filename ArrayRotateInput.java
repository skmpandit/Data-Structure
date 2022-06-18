import java.util.Scanner;

public class ArrayRotateInput {
    void LeftRotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++) {
            LeftRotateOne(arr, n);
        }
    }

    void LeftRotateOne(int arr[], int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    void PrintArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n, d, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of rotations: ");
        d = sc.nextInt();
        sc.close();
        ArrayRotateInput rotate = new ArrayRotateInput();
        rotate.LeftRotate(arr, d, n);
        rotate.PrintArray(arr, n);
    }
}
