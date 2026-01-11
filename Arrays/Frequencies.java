import java.util.*;
public class Frequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {   
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> fMap = new HashMap<>();
        for(int num : arr) {
            if(fMap.containsKey(num)) {
                fMap.put(num, fMap.get(num) + 1);
            } else {
                fMap.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : fMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
