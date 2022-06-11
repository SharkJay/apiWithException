package 数组高级操作.二分查找;
//有一个前提条件，数组内的元素一定要按照大小顺序排列，如果没有大小顺序，是不能使用二分查找法的
public class Demo1 {
    public static void main(String[] args) {

        //定义数组
        int[] numberArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        //要查找的数
        int number = 3;

        //定义查找方法
        int index = SearchErfeng(numberArr,number);

        System.out.println(index);
    }

    private static int SearchErfeng(int[] numberArr, int number) {
        //查找的范围
        int min = 0;
        int max = numberArr.length - 1;
        //循环查找
        while (min <= max) {
            //min<max
            //计算mid中间位置
            int mid = (min + max) / 2;
            //要找的数在mid索引对应的数的左边
            if (number < numberArr[mid]) {
                max = mid - 1;
            }else if(number > numberArr[mid]){
                min = mid + 1;
            }else{
                //min == max
                return mid;
            }

        }

        //如果min大于了max就表示元素不存在,返回‐1
        return -1;
    }
}
