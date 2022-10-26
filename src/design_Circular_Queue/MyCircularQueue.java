package design_Circular_Queue;

public class MyCircularQueue {
    int[] queue;
    int f = 0, b = -1, len = 0;


    public MyCircularQueue(int k) {
        queue = new int[k];
    }

    public boolean enQueue(int value) {
        if (!isFull()) {
            b = (b + 1) % queue.length;
            queue[b] = value;
            len++;
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        if (!isEmpty()) {
            f = (f + 1) % queue.length;
            len--;
            return true;
        }
        return false;
    }

    public int Front() {
        return isEmpty() ? -1 : queue[f];
    }

    public int Rear() {
        return isEmpty() ? -1 : queue[b];
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public boolean isFull() {
        return len == queue.length;
    }

}
