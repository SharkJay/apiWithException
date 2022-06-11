package jdk8时间类.plus系列方法;

import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(1990, 12, 1, 2, 45, 6);
        LocalDateTime localDateTime1 = localDateTime.plusYears(2);
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = localDateTime.plusMonths(-2);
        System.out.println(localDateTime2);

    }
}
/*public LocalDateTime plusYears (long years) 添加或者减去年
public LocalDateTime plusMonths(long months) 添加或者减去月
public LocalDateTime plusDays(long days) 添加或者减去日
public LocalDateTime plusHours(long hours) 添加或者减去时
public LocalDateTime plusMinutes(long minutes) 添加或者减去分
public LocalDateTime plusSeconds(long seconds) 添加或者减去秒
public LocalDateTime plusWeeks(long weeks) 添加或者减去周*/