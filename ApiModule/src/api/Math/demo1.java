package api.Math;

public class demo1 {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            double r = Math.random();//选中这两行，按ctrl Alt t三个键选择for循环
            System.out.println(r);
        }

        int abs = Math.abs(-11);
        System.out.println(abs);
    }
}
/*public static int abs(int a) 返回参数的绝对值
public static double ceil(double a)
返回大于或等于参数的最小double值，等于一个整数
public static double floor(double a)
返回小于或等于参数的最大double值，等于一个整数
public static int round(float a) 按照四舍五入返回最接近参数的int
public static int max(int a,int b) 返回两个int值中的较大值
public static int min(int a,int b) 返回两个int值中的较小值
public static double pow (double a,double
b)
返回a的b次幂的值
public static double random() 返回值为double的正值，[0.0,1.0)*/