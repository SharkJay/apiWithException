package 异常.trycatch常见问题;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入年龄：");
            String line = sc.nextLine();
            int age = Integer.parseInt(line);//可能出现异常
            System.out.println(age);
            System.out.println(2 / 0);//可能出现异常
            System.out.println("123");
        } catch (NumberFormatException e) {
            System.out.println("输入类型异常");
        } catch (ArithmeticException e) {
            System.out.println("数学运算异常");
        }
        System.out.println("继续执行try catch外的代码");
    }
}
