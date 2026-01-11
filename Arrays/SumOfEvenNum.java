import java.util.Scanner;
public class SumOfEvenNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        boolean hasEven = false;
        for(int num : arr){
            if(num % 2 == 0){
                sum += num;
                hasEven = true;
            }
            
        }
        if(hasEven){
            System.out.println("Sum of even number is:"+sum);
        }
        else{
            System.out.println("No even numbers in the array");
        }
    }
}
