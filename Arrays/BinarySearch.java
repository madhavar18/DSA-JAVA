import java.util.*;
class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int first = 0, last = n - 1;
        while(first <= last) {
            int mid = (first + last) / 2;
            if(arr[mid] == target) {
                System.out.println(mid);
                return;
            }
            else if(arr[mid] < target) {
                first = mid + 1;
            }
            else {
                last = mid - 1;
            }
        }
        System.out.println(-1);
    }
}