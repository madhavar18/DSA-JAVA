import java.util.*;
class DailyTemperatures {
    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0) return -1;
        if (n == 1) return 0;
        int[] temps = new int[n];
        for(int i = 0; i < n; i++) {
            temps[i] = sc.nextInt();
        }
        int[] results = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && temps[i] > temps[st.peek()]) {
                int prevIndex = st.pop();
                results[prevIndex] = i - prevIndex;
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(results));
        return 0;
    }
}