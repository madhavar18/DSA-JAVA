// this solution is brute force approach with time complexity of O(n^2)
class LongestSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1};
        int targetSum = 3;
        int maxLength = -1;
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j <  arr.length; j++) {
                sum += arr[j];
                if(sum == targetSum) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        System.out.println(maxLength);
    }
}