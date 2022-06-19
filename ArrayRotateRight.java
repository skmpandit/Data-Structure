
public class ArrayRotateRight {
    void Rotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++) {
            RotateOne(arr, n);
        }
    }

    void RotateOne(int arr[], int n) {
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
        ArrayRotateRight rotate = new ArrayRotateRight();
        int arr[] = { 1, 2, 3, 4, 5 };
        rotate.Rotate(arr, 2, arr.length);
        rotate.PrintArray(arr, arr.length);
    }
}