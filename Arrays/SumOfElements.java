public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, -6};
        long sum = 0;

        if(arr == null || arr.length == 0){
            System.out.println("Sum of the elements is: "+sum);
            return;
        }
        for(int num : arr){
            sum += num;
        }
        System.out.println("Sum of the elements is: "+sum);
    }
}