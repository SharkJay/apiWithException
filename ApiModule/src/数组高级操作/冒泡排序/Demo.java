package 数组高级操作.冒泡排序;

public class Demo {
    public static void main(String[] args) {

        //定义数组
        int[] arr = new int[]{2, 1, 9, 4, 7, 3};

        bubbleSort(arr);

        printArr(arr);

    }

    private static void bubbleSort(int[] arr) {
        //外层循环代表比较次数
        for (int i = 0; i < arr.length - 1; i++) {
            //内存循环就是实际循环比较的
            //‐1 是为了让数组不要越界
            //‐i 每一轮结束之后,我们就会少比一个数字.
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //如果左边数字大于右边，就交换
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void printArr(int[] arr) {
        //比较结束，遍历数组，输出每一个元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //全部元素输出完毕再换行
        System.out.println();
    }
}
