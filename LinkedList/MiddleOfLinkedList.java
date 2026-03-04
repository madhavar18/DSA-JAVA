import java.util.*;
class MiddleLOfinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static int findMiddle(Node head){
        if(head == null) {
            return -1;
        }
        Node slow  = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;

        for(int  i = 0; i < n; i++) {
            int data = sc.nextInt();

            if(head == null) {
                head = new Node(data);
                tail = head;
            }
            else {
                tail.next = new Node(data);
                tail = tail.next;
            }
        }
        System.out.println(findMiddle(head));
    }

}