package jdk8时间类.LocalDateTime.获取时间的方法;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2022, 11, 11, 11, 11, 11);

//        public int getYear() 获取年
        int year = localDateTime.getYear();
        System.out.println("年份为：" + year);
//        public int getMonthValue() 获取月份（1-12）
        int monthValue = localDateTime.getMonthValue();
        System.out.println("月份为：" + monthValue);
//        public int getDayOfMonth() 获取月份中的第几天（1-31）
        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println("月份中的第" + dayOfMonth + "天");
//        public int getDayOfYear() 获取一年中的第几天（1-366）
        int dayOfYear = localDateTime.getDayOfYear();
        System.out.println("一年 中的第" + dayOfYear + "天");
//        public DayOfWeek getDayOfWeek() 获取星期
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("一周中的第" + dayOfWeek + "天");
//        public int getMinute() 获取分钟
        int minute = localDateTime.getMinute();
        System.out.println(minute);
//        public int getHour() 获取小时
        int hour = localDateTime.getHour();
        System.out.println(hour);
    }
}
