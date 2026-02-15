import java.util.*;
public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        int n = arr.length;
        int nextIndex = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[nextIndex] = arr[i];
                nextIndex++;
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}