import java.util.*;
class NextGreaterEleII {
    public static int[] NGE(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Deque<Integer> st  = new ArrayDeque<>();
        
        for(int i = 0; i < (2*n); i++) {
            int currentIndex = i % n;
            while(!st.isEmpty() && arr[currentIndex] > arr[st.peek()]) {
                res[st.pop()] = arr[currentIndex];
            }
            if(i < n) {
                st.push(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(NGE(arr)));
    }
}