public class ArrayRotateJugglingAgo {
    public static int GDC(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GDC(b, a % b);
        }
    }

    void Rotate(int arr[], int d, int n) {
        int i, j, k, temp;
        for (i = 0; i < GDC(n, d); i++) {
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

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int d = 2, n = arr.length;
        System.out.println("Array before Rotate: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        ArrayRotateJugglingAgo rotate = new ArrayRotateJugglingAgo();
        rotate.Rotate(arr, d, n);
        System.out.println("\n\nArray after Rotate: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
