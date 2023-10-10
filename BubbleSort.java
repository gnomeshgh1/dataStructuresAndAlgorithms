public class BubbleSort {
    public void bubbleSort(int[] a,int n){                   //a:数组  n:数组个数
        if (n <= 1) return;
        for(int i = 0; i < n; ++i){
            boolean flag = false;                            //退出循环的标志
            for(int j = 0; j < n - i -1; ++j){
                if(a[j] > a[j+1]){                           //交换
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;                                 //有数据交换
                }
            }
            if(!flag) break;                                 //没有数据交换，退出
        }
    }
}
