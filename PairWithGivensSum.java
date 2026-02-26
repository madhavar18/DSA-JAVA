// this is brute force solution with time complexity O(n^2) 

class PairWithGivensSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }
}