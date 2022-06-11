package jdk8时间类.LocalDateTime.转换对象;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2022, 6, 9, 12, 11, 10);

//        public LocalDate toLocalDate () 转换成为一个LocalDate对象

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
//        public LocalTime toLocalTime () 转换成为一个LocalTime对象
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);
    }
}
