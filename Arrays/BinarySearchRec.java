import java.util.*;
class BinarySearchRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(binarySearch(arr, target, 0, n - 1));
    }

    public static int binarySearch(int arr[], int target, int first, int last) {
        if(first > last) {
            return -1;
        }
        int mid = first + (last - first) / 2;
        if(arr[mid] == target) {
            return mid;
        }
        else if(arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, last);
        }
        else {
            return binarySearch(arr, target, first, mid - 1);
        }
    }
}