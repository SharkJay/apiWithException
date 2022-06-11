package api.Arrays;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
//        public static String toString(int[] a) 返回指定数组的内容的字符串表示形式
        int[] arr1 = new int[]{3, 2, 4, 6, 7};
        /*String s1 = Arrays.toString(arr1);
        System.out.println(s1);*/

//        public static void sort(int[] a) 按照数字顺序排列指定的数组
        Arrays.sort(arr1);
//       System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr1));


//        public static int binarySearch(int[] a, int key) 利用二分查找返回指定元素的索引
        /*int[] arr2 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(arr2, 4);
        System.out.println(index);*/

    }
}
