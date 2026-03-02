import java.util.*;
class LongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, max = 0;
        while(j < s.length()) {
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                max = Math.max(max, j - i);
            }
            else {
                set.remove(s.charAt(i));
                i++;
        }
        }
        System.out.println(max);
    }
}