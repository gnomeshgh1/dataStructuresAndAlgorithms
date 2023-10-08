public class CircularQueue {                          // 数组：items，数组大小：n
    private String[] items;
    private int n = 0;                                // head表示队头下标，tail表示队尾下标
    private int head = 0;
    private int tail = 0;

    public CircularQueue(int capacity) {              // 申请一个大小为capacity的数组
        items = new String[capacity];
        n = capacity;
    }

    public boolean enqueue(String item) {             // 入队
        if ((tail + 1) % n == head) return false;     // 队列满了
        items[tail] = item; tail = (tail + 1) % n;
        return true;
    }

    public String dequeue() {                          // 出队
        if (head == tail) return null;                 // 如果head == tail 表示队列为空
        String ret = items[head];
        head = (head + 1) % n;
        return ret;
    }
}
