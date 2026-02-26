// this solution is hashmap approach with time complexity of O(n)
import java.util.*;

class LongestSubArraySum1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1};
        int targetSum = 3;
        int maxLength = -1;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum == targetSum) {
                maxLength = Math.max(maxLength, i + 1);
            }


            if(map.containsKey(sum - targetSum)) {
                maxLength = Math.max(maxLength, i - map.get(sum - targetSum));
            }

            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        System.out.println(maxLength);
    }
}