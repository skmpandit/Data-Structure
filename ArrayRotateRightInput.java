import java.util.Scanner;

public class ArrayRotateRightInput {
    void rotateRight(int arr[], int d, int n) {
        for (int i = 0; i < d; i++) {
            rotateRightOne(arr, n);
        }
    }

    void rotateRightOne(int arr[], int n) {
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    void ArrayPrint(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int i, d, n;
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
        ArrayRotateRightInput rotate = new ArrayRotateRightInput();
        rotate.rotateRight(arr, d, n);
        rotate.ArrayPrint(arr, n);
    }
}
