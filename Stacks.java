class Stack {

    private int maxSize;
    private int[] arr;
    private int top;

    Stack(int Length) {
        arr = new int[Length];
        maxSize = Length;
        top = -1;
    }

    void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println(x + " has been inserted to the stack");
        arr[++top] = x;
    };

    void delete() {
        if (isExpty()) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        System.out.println(arr[top] + " has been removed from the stack");
        top--;

    };

    boolean isFull() {

        return top == maxSize - 1;

    };

    boolean isExpty() {
        return top == -1;
    };
}

public class Stacks {
    public static void main(String[] args) {

        Stack obj = new Stack(5);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.delete();
        obj.delete();
        obj.delete();
        obj.delete();
        obj.delete();

    }
}