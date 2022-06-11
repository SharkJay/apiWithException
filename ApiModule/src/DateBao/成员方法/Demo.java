package DateBao.成员方法;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Method1();

//        public void setTime(long time) 设置时间，给的是毫秒值
        /*Date d2 = new Date();
        d2.setTime(3600L*1000);
        System.out.println(d2);*/
    }

    private static void Method1() {
        //        public long getTime() 获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
        Date d1 = new Date();
        long t1 = d1.getTime();
        System.out.println(t1);
        System.out.println(System.currentTimeMillis());
    }
}
