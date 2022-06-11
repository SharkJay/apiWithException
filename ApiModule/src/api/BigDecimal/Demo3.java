package api.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo3 {
    public static void main(String[] args) {

        BigDecimal bd1 = new BigDecimal("10.0");
        BigDecimal bd2 = new BigDecimal("9.0");

        /*BigDecimal divide = bd1.divide(参与运算的对象,小数点后精确到多少位,舍入模式);
        参数1 ，表示参与运算的BigDecimal 对象。
        参数2 ，表示小数点后面精确到多少位
        参数3 ，舍入模式
        BigDecimal.ROUND_UP 进一法
        BigDecimal.ROUND_FLOOR 去尾法
        BigDecimal.ROUND_HALF_UP 四舍五入*/

        BigDecimal divide = bd1.divide(bd2, 2, RoundingMode.HALF_UP);
        System.out.println(divide);
    }
}
