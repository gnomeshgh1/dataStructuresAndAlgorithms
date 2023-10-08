public class ArrayQueue{
    private String[] items;                       //数组
    private int n = 0;                            //数组大小
    private int head = 0;                         //头指针下标
    private int tail = 0;                         //尾指针下标

    public ArrayQueue(int capacity){              //初始化
        this.items = new String[capacity];
        this.n = capacity;
    }

    public boolean enqueue(String item){           //入队
        if (tail == n) {                             // tail == n表示队列末尾没有空间了
            if (head == 0) return false;             // tail ==n && head==0，表示整个队列都占满了
            for (int i = head; i < tail; ++i) {      // 数据搬移
                items[i-head] = items[i];
            }
            tail -= head;                            // 搬移完之后重新更新head和tail
            head = 0;
        }
        items[tail] = item;
        ++tail;
        return true;
    }

    public String dequeue(){                       //出队
        if(head == tail) return null;              //头指针和尾指针相等，说明队列为空
        String temp = items[head];                 //去除头指针的元素
        ++head;
        return temp;
    }
}

