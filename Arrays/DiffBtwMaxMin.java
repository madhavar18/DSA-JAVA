import java.util.*;
public class DiffBtwMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if(num > max) 
                max = num;
            else if(num < min)
                min = num;
        }
        int diff = max - min;
        System.out.println(diff);
    }
}
