import java.util.*;

class SlidingWindowMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < n; i++) {

            // remove indices outside window
            if(!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            // remove smaller elements
            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.removeLast();
            }

            dq.addLast(i);

            // print max when window complete
            if(i >= k - 1) {
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }
    }
}