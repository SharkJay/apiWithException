package DateBao.Date构造方法;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
//        public Date() 分配一个 Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
        Date d1 = new Date();
        System.out.println(d1);
//public Date(long date) 分配一个 Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
        Date d2 = new Date(0L);
        System.out.println(d2);

        Date d3 = new Date(3600L * 1000);
        System.out.println(d3);
    }
}
