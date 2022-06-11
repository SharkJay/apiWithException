package api.Integer;

public class Demo1 {
    public static void main(String[] args) {

        //String转换为int
        String s = "100";
        int i = Integer.parseInt(s);
        System.out.println(i);

        //int转换为String
        //方法1
        int i2 = 2;
        String s2 = i2 + "";
        System.out.println(s2 + 100);

        //方法2
        String s3 = String.valueOf(i2);
        System.out.println(s3 + 200);
    }
}
