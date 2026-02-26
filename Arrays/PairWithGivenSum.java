// this is a hashmap based solution with time complexity O(n)
import java.util.*;
class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer, Integer> m1 = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(m1.containsKey(target - arr[i])) {
                System.out.println(true);
                return;
            }
            m1.put(arr[i], 1);
        }
        System.out.println(false);
    }
}