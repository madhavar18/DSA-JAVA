import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        boolean wasUpdated = false;
        for(int i = 0; i < n; i++) {
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] < firstLargest) {
                secondLargest = arr[i];
                wasUpdated = true;
            }
            else {
                continue;
            }
        }
        System.out.print(wasUpdated ? secondLargest : -1);
    }
}
