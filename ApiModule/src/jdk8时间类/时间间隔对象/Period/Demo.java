package jdk8时间类.时间间隔对象.Period;

import java.time.LocalDate;
import java.time.Period;

public class Demo {
    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2018, 3, 2);
        LocalDate localDate2 = LocalDate.of(2020, 4, 5);
        Period period = Period.between(localDate1, localDate2);
        System.out.println(period);

        System.out.println("--------------------------");

        int years = period.getYears();
        System.out.println(years);

        System.out.println("--------------------------");

        int months = period.getMonths();
        System.out.println(months);
    }
}
/*public static Period between(开始时间,结束时间) 计算两个“时间"的间隔
public int getYears() 获得这段时间的年数
public int getMonths() 获得此期间的总月数
public int getDays() 获得此期间的天数
public long toTotalMonths() 获取此期间的总月数*/