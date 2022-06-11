package api.SystemBao;

/*static void arraycopy​(Object src, int srcPos, Object dest, int destPos, int length)
将指定源数组中的数组从指定位置复制到目标数组的指定位置。  */
public class Test1 {
    public static void main(String[] args) {

        //定义静态数组
        int[] arr1 = new int[]{2, 4, 5, 1, 3};
        //定义动态数组
        int[] arr2 = new int[10];

        //通过System里的arraycopy方法把数组1的数据复制到数组2中
        //从数组1的索引1数据开始，复制到arr2的索引2开始，数组1中的复制长度为数组1的长度减一
        System.arraycopy(arr1, 1, arr2, 2, arr1.length - 1);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
