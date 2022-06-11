package 数组高级操作.快速排序;

public class Demo2 {
    public static void main(String[] args) {

        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quiteSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quiteSort(int[] arr, int left, int right) {

        if (left > right) {
            return;//退出当前函数
        }

        int left0 = left;
        int right0 = right;

        //计算出基准数
        int baseNumber = arr[left0];

        while (left != right) {
            // 1，从右开始找比基准数小的
            while (arr[right] >= baseNumber && right > left) {
                right--;
            }
            // 2，从左开始找比基准数大的
            while (arr[left] <= baseNumber && right > left) {
                left++;
            }
            // 3，交换两个值的位置
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;

        quiteSort(arr, left0, left - 1);
        quiteSort(arr, left + 1, right0);
    }
}
