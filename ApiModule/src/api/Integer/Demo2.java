package api.Integer;
//有一个字符串：“91 27 46 38 50”，请写程序实现最终输出结果是：27 38 46 50 91
public class Demo2 {
    public static void main(String[] args) {

        String s = "91 27 46 38 50";

        String[] strArr = s.split(" ");

        int[] numberArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            int number = Integer.parseInt(strArr[i]);
            numberArr[i] = number;
        }

        for (int i = 0; i < numberArr.length; i++) {
            System.out.println(numberArr[i]);
        }
    }
}
