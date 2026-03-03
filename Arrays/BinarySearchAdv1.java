import java.util.*;
class BinarySearchAdv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();
        }
        int target = sc.nextInt();
        int first = 0, last = n - 1, ans = -1;
        while(first <= last) {
            int mid = (first + last) / 2;
            if(arr[mid] == target) {
                ans = mid;
                first = mid + 1;
            }
            else if(arr[mid] < target) {
                first = mid + 1;
            }
            else {
                last = mid - 1;
            }
        }
        System.out.println(ans);
    }
}