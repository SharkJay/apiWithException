package api.BigDecimal;

import java.math.BigDecimal;

public class Demo1 {
    public static void main(String[] args) {
        /*BigDecimal(double val) 参数为double
BigDecimal(String val) 参数为String*/

        BigDecimal bd1 = new BigDecimal(10.0);
        BigDecimal bd2 = new BigDecimal("0.3");

        System.out.println(bd1);
        System.out.println(bd2);
    }
}
