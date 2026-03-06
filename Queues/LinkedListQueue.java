class Queue {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head = null;
    Node tail = null;

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int dequeue() {
        if(head == null) {
            System.out.println("queue underflow");
            return -1;
        }
        int removedEle = head.data;
        if(head == tail) {
            head = tail = null;
            return removedEle;
        }
        head = head.next;
        return removedEle;
    }

    public int peek() {
        if(head == null) {
            System.out.println("queue underflow");
            return -1;
        }
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
       Node temp = head;
       while(temp != null) {
        System.out.print(temp.data+" ");
        temp = temp.next;
       }
       System.out.println();
    }
}

class LinkedListQueue {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.display();
        System.out.println(q1.peek());
        System.out.println(q1.dequeue());
        System.out.println(q1.peek());
        q1.enqueue(50);
        q1.display();
        q1.enqueue(60);
    }
}