class Queue {
    private int[] queue;
    private int front;
    private int rear;

    public Queue(int size) {
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int value) {
        if(rear == queue.length - 1) {
           System.out.println("Queue Overflow");
           return;
        }
        if(front == -1) {
            front = rear = 0;
            queue[rear] = value;
            return;
        }
        rear++;
        queue[rear] = value;
    }

    public int dequeue() {
        if(front == -1) {
            System.out.println("Queue underflow");
            return -1;
        }
        if(front == rear) {
            int removedEle = queue[front];
            front = rear = -1;
            return removedEle;
        }
        int removedEle = queue[front];
        front++;
        return removedEle;
    }

    public void peek() {
        if(front != -1) {
            System.out.println(queue[front]);
            return;
        }
        System.out.println("queue underflow");
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void display() {
        int temp = front;
        while(!(temp > front)) {
            System.out.println(queue[temp]);
            temp++;
        }
    }
}

class ArrayQueue {
    public static void main(String[] args) {
        Queue q1 = new Queue(5);
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.display();
        q1.peek();
        System.out.println(q1.dequeue());
        q1.peek();
        q1.enqueue(50);
        q1.display();
        q1.enqueue(60);
    }
}