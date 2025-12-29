public class SortedArrayCheck {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        if(arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] > arr[i]){
                System.out.println("Array is not sorted");
                return;
            }
              
        }
          System.out.println("Array is Sorted");
    }
}