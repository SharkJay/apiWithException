package api.BigDecimal;

import java.math.BigDecimal;

public class Demo2 {
    public static void main(String[] args) {
//        public BigDecimal add(另一个BigDecimal对象) 加法
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");

        BigDecimal add = bd1.add(bd2);
        System.out.println(add);
//        public BigDecimal subtract (另一个BigDecimal对象) 减法
        BigDecimal subtract = bd1.subtract(bd2);
        System.out.println("减法为："+subtract);
//        public BigDecimal multiply (另一个BigDecimal对象) 乘法
        BigDecimal multiply = bd1.multiply(bd2);
        System.out.println("乘法为："+multiply);
//        public BigDecimal divide (另一个BigDecimal对象) 除法
        BigDecimal divide = bd1.divide(bd2);
        System.out.println("除法为："+divide);
//        public BigDecimal divide (另一个BigDecimal对象，精确几位，舍入模式) 除法

    }
}
