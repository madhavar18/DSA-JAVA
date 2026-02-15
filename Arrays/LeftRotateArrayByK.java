import java.util.*;
public class LeftRotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if(k > arr.length) {
            k = k % arr.length;
        }
        for(int i = 0; i < k; i++) {
            int temp = arr[0];
            for(int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}