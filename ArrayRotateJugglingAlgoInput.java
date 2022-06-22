import java.util.Scanner;

public class ArrayRotateJugglingAlgoInput {
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }

    void RotateArray(int arr[], int d, int n) {
        int i, j, k, temp;
        for (i = 0; i < GCD(n, d); i++) {
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n) {
                    k = k - n;
                }
                if (k == i) {
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    void PrintArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int i, n, d, arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the element of the Array: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the rotate Size: ");
        d = sc.nextInt();
        ArrayRotateJugglingAlgoInput rotate = new ArrayRotateJugglingAlgoInput();
        rotate.RotateArray(arr, d, n);
        rotate.PrintArray(arr, n);
    }
}
