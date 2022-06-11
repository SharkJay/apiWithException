package jdk8时间类.LocalDateTime.获取时间对象;

import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {

        /*public static LocalDateTime now() 获取当前系统时间
        public static LocalDateTime of (年, 月 , 日, 时,
        分, 秒)使用指定年月日和时分秒初始化一个LocalDateTime对象*/

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime of = LocalDateTime.of(2022, 11, 11, 11, 11, 11);
        System.out.println(of);
    }
}
