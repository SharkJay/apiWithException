package jdk8时间类.格式和解析;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo {
    public static void main(String[] args) {

        //methodFormat();

        System.out.println("-----------------------------");

        /*String s = "1997年10月2日 11:09:51";
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(s, pattern);
        System.out.println(localDateTime);*/

        String s = "2011年12月11日 10:23:31";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(s, dateTimeFormatter);
        System.out.println(parse);

        int dayOfYear = parse.getDayOfYear();
        System.out.println("一年中的第" + dayOfYear + "天");

    }

    private static void methodFormat() {
        LocalDateTime localDateTime = LocalDateTime.of(2022, 2, 1, 12, 11, 23);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String result = localDateTime.format(dateTimeFormatter);
        System.out.println(result);
    }
}

/*public String format (指定格式) 把一个LocalDateTime格式化成为一个字符串
public LocalDateTime parse (准备解析的字符串, 解析格式)把一个日期字符串解析成为一个LocalDateTime对象
public static DateTimeFormatter ofPattern(String pattern)使用指定的日期模板获取一个日期格式化器 DateTimeFormatter对象*/