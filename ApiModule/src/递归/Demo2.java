package 递归;

public class Demo2 {
    public static void main(String[] args) {

        int num = 5;
        int multiply = getJc(num);
        System.out.println(multiply);
    }

    private static int getJc(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * getJc(num - 1);
        }
    }
}
