package 异常.throw抛出异常;
/*格式
throw new 异常();
注意
这个格式是在方法内的，表示当前代码手动抛出一个异常，下面的代码不用再执行了*/

/*     throws                                           throw
用在方法声明后面，跟的是异常类名                 用在方法体内，跟的是异常对象名
表示声明异常，调用该方法有可能会出现这样的异常    表示手动抛出异常对象，由方法体内的语句处理*/
public class Demo {
    public static void main(String[] args) {

        /*try {
        可能出现异常的代码;
        } catch(异常类名 变量名) {
        异常的处理代码;
        }*/

        /*程序从 try 里面的代码开始执行
        出现异常，就会跳转到对应的 catch 里面去执行
        执行完毕之后，程序还可以继续往下执行*/

        //int[] arr = new int[]{1,2,3,4,5};
        int[] arr = null;
        try {
            printArr(arr);//接收异常并且自己处理异常
        } catch (NullPointerException e) {
            System.out.println("参数不能为null");
            System.out.println("程序还可以接着往下执行！！！");
        }

    }

    private static void printArr(int[] arr) {

        if (arr == null) {

            //System.out.println("参数不能为null");

            throw new NullPointerException();//当参数为null，手动创建异常抛给调用者

        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
