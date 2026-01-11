import java.util.*;
public class MaxSubArray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int num : arr) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
