import java.util.*;
class NextGreaterEle {

    public static int[] nextGreatEle(int[] arr) {
        Deque<Integer> st = new ArrayDeque();  
        int ans[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()) {
            ans[st.pop()] = -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = nextGreatEle(arr);
        System.out.println(Arrays.toString(ans));
    }
}