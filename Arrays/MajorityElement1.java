class MajorityElement1 {
    public static void main(String[] args) {
        int arr[] = {2,2,1,2,3,2,2};
        int candidate = arr[0];
        int count = 0;
        int freq = 0;
        for(int i = 0; i < arr.length; i++) {
            if(count == 0){
                candidate = arr[i];
            }
            if(arr[i] == candidate) {
                count++;
            }
            else { 
                count--;
            }
        }
       for(int num : arr) {
        if(num == candidate) {
            freq++;
        }
       }
       if(freq > arr.length / 2) {
        System.out.println(candidate);
       }
       else {
        System.out.println(-1);
       }
    }
}