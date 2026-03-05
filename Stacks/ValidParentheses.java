import java.util.*;
class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            else {
                if(st.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                char top = st.peek();
                if((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    st.pop();
                }
                else{
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(st.isEmpty());
    }
}