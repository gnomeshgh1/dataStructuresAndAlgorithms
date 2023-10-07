public class ArrayStack {
        private String[] items;             //数组
        private int n;                      //数组的大小也就是栈的大小
        private int count;                  //栈中的元素个数

        public ArrayStack(int n){           //初始化为n个元素的栈
            this.items = new String[n];
            this.n = n;
            this.count = 0;
        }

        public boolean push(String item){    //入栈操作
            if(count == n) return false;     //元素个数为栈的大小，即栈满了，入栈失败直接返回false
            items[count] = item;             //将元素放在下标为count的位置，并且count加一
            ++count;
            return true;
        }

        public String pop(){                 //出栈操作
            if(count == 0) return null;      //元素个数为0，即栈中没有元素，返回null
            String temp = items[count-1];    //返回下标为count-1位置的元素，并且count减一
            items[count-1] = null;
            --count;
            return temp;
        }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(3);
        arrayStack.push("a");
        arrayStack.push("b");
        arrayStack.push("c");
        arrayStack.push("d");
        String a1 = arrayStack.pop();
        String a2 = arrayStack.pop();
        String a3 = arrayStack.pop();
        String a4 = arrayStack.pop();
    }
}
