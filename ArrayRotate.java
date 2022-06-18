
class ArrayRotate {
    void LeftRotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++) {
            LeftRotateByOne(arr, n);
        }
    }

    void LeftRotateByOne(int arr[], int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    void PrintArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        ArrayRotate roate = new ArrayRotate();
        int arr[] = { 1, 3, 4, 5, 6, 7, 8, 9 };
        roate.LeftRotate(arr, 3, arr.length);
        roate.PrintArray(arr, arr.length);
    }
}