package 递归;

public class Demo {
    public static void main(String[] args) {

        int num = 100;
        int sum = getSum(num);
        System.out.println(sum);
    }

    private static int getSum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + getSum(num -1);
        }
    }
}
