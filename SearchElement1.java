import java.util.Scanner;

public class SearchElement1 {
    public static int Search(int arr[], int key) {
        int low = 0, high = arr.length - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[low] < arr[mid]) {
                if (key >= arr[low] && key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (key > arr[mid] && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        System.out.printf("Search(%d)= %d%n", key, Search(arr, key));
    }
}
