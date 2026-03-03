import java.util.*;

class LinkedList {

    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at end
    public static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    // Insert at beginning
    public static Node insertAtFront(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    // Traverse
    public static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Reverse
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Delete node by key
    public static Node delete(Node head, int key) {

        if (head == null) return null;

        // If head needs deletion
        if (head.data == key) {
            return head.next;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Node head = null;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            head = insertAtEnd(head, value);
        }

        // Traverse
        traverse(head);

        // Insert at front
        head = insertAtFront(head, 100);
        traverse(head);

        // Reverse
        head = reverse(head);
        traverse(head);

        // Insert at end
        head = insertAtEnd(head, 200);
        traverse(head);

        // Delete
        int key = sc.nextInt();
        head = delete(head, key);
        traverse(head);

        sc.close();
    }
}