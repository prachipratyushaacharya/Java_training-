public class queue {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        q.display();

        q.enque(60);

        q.deque();
        q.deque();
        q.deque();
        q.display();

        q.enque(60);
        q.display();

        q.deque();
        q.deque();
        q.deque();
        q.deque();
    }
}

class Queue {
    int N = 5;
    int[] qu = new int[N];
    int front = -1, rear = -1;

    void enque(int x) {
        if (front == -1 && rear == -1) {
            front = rear = 0;
            qu[rear] = x;
        } else if ((rear + 1) % N == front)
            System.out.println("Queue is FULL\n");
        else {
            rear = (rear + 1) % N;
            qu[rear] = x;
        }
    }

    void deque() {
        if (front == -1 && rear == -1)
            System.out.println("Queue is EMPTY\n");
        else if (front == rear)
            front = rear = -1;
        else
            front = (front + 1) % N;
    }

    void display() {
        if (front == -1 && rear == -1)
            return;

        for (int i = front; i != rear; i = (i + 1) % N)
            System.out.print(qu[i] + " ");

        System.out.println(qu[rear] + "\n");
    }
}
