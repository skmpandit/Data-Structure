import java.util.Scanner;

public class JugglingAlgo {
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }

    void ArrayRotate(int arr[], int k, int n) {
        int i, temp, j, d = -1;
        for (i = 0; i < GCD(n, k); i++) {
            temp = arr[i];
            j = i;
            while (true) {
                d = (j + k) % n;
                if (d == i) {
                    break;
                }
                arr[j] = arr[d];
                j = d;
            }
            arr[j] = temp;
        }
    }

    void ArrayPrint(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int i, k, n, arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of Array: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the rotate size: ");
        k = sc.nextInt();
        JugglingAlgo rotate = new JugglingAlgo();
        rotate.ArrayRotate(arr, k, n);
        rotate.ArrayPrint(arr, n);
    }
}
