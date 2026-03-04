import java.util.*;
class MergeSortedArrays {

    public static int[] merge(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while(i < a.length && j < b.length) {
            if(a[i] <= b[j]) {
                merged[k] = a[i];
                i++; k++;
            }
            else {
                merged[k] = b[j];
                j++; k++;
            }
        }

        
        while(i < a.length) {
            merged[k] = a[i];
            i++; k++;
        }
        
        while(j < b.length) {
            merged[k] = b[j];
            j++; k++;
        }
        return merged;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] a = new int[i];
        for(int m = 0; m < i; m++) {
            a[m] = sc.nextInt();
        }
        int j = sc.nextInt();
        int[] b = new int[j];
        for(int n = 0; n < j; n++) {
            b[n] = sc.nextInt();
        }
        System.out.println(Arrays.toString(merge(a, b)));
    }
}