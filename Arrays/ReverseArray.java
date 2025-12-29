import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int start = 0;
        int last = arr.length-1;

        while(start < last){
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start ++;
            last --;
        }
        System.out.println("Reversed array: "+Arrays.toString(arr));
    }
}

//time complexity : O(n)
//space complexity : O(1)

