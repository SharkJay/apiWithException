package DateBao.jdk8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {

        //Method1();

        //jdk8
        String s = "2020年11月11日 00:00:00";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(s, dateTimeFormatter);
        LocalDateTime newlocalDateTime = localDateTime.plusDays(1);
        //转换为
        String result = newlocalDateTime.format(dateTimeFormatter);
        System.out.println(result);

    }

    private static void Method1() throws ParseException {
        String s = "2020年11月11日 00:00:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse(s);

        //得到从字符串中的初始时间到当前时间的毫秒值
        long time = date.getTime();
        System.out.println(time);
        System.out.println("----------------");

        //在此基础上增加一天时间
        //一小时等于60分钟，一分钟等于60秒，一秒等于1000毫秒，一天有24小时
        time = time + (60 * 60 * 1000 * 24);

        //得到加一天之后的新日期
        Date newdate = new Date(time);
        //转换成字符串
        String result = newdate.toString();
        System.out.println(result);
    }
}
