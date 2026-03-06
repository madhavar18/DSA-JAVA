import java.util.*;
class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        int[] span = new int[n];
        Stack<Integer> st = new Stack();
        for(int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++ ) {
            while(!st.isEmpty() && prices[st.peek()] <= prices[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                span[i] = i + 1;
            }
            else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        for(int x : span) {
            System.out.println(x+" ");
        }
    }
}