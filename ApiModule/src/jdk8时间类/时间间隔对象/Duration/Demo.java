package jdk8时间类.时间间隔对象.Duration;

import java.time.Duration;
import java.time.LocalDateTime;

/*public static Duration between(开始时间,结束时间) 计算两个“时间"的间隔
public long toSeconds() 获得此时间间隔的秒
public int toMillis() 获得此时间间隔的毫秒
public int toNanos() 获得此时间间隔的纳秒*/
public class Demo {
    public static void main(String[] args) {

        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 1, 2, 11, 11, 34);
        LocalDateTime localDateTime2 = LocalDateTime.of(2021, 1, 2, 12, 3, 21);
        Duration duration = Duration.between(localDateTime1, localDateTime2);
        System.out.println(duration);

        System.out.println("------------------");

        System.out.println(duration.toSeconds());

        System.out.println(duration.toMillis());

        System.out.println(duration.toNanos());
    }
}
