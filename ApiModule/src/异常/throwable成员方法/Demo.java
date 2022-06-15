package 异常.throwable成员方法;
/*public String getMessage() 返回此 throwable 的详细消息字符串
public String toString() 返回此可抛出的简短描述
public void printStackTrace() 把异常的错误信息输出在控制台*/
public class Demo {
    public static void main(String[] args) {

        try {
            int[] arr = new int[]{1,2,3,4,5};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            /*String message = e.getMessage();
            System.out.println(message);*/

            /*String s = e.toString();
            System.out.println(s);*/

            e.printStackTrace();
        }

        System.out.println("try catch 处理完继续执行接下来的代码");
    }
}
