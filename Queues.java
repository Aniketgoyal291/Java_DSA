class Queue {
    int size = 10;
    int[] items = new int[size];
    int front, rear;

    Queue() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    void inQueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = x;
            System.out.println(x + " is inserted.");
        }
    }

    void deQueue() {
        int x;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(-1);
        } else {
            x = items[front];
            System.out.println(x + " has been deleted.");
        }
        front++;
    }

}

public class Queues {
    public static void main(String[] args) {

        Queue obj = new Queue();

        obj.inQueue(14);
        obj.inQueue(28);
        obj.deQueue();
        obj.deQueue();

    }
}