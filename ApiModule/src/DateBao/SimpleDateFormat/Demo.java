package DateBao.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {

        //当前的时间对象
        /*Date d1 = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String result1 = sdf1.format(d1);
        System.out.println(result1);*/

        String s = "2022-06-09";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf2.parse(s);
        System.out.println(d);

    }
}
/*public SimpleDateFormat() 构造一个SimpleDateFormat，使用默认模式和日期格式
public SimpleDateFormat(String pattern)
构造一个SimpleDateFormat使用给定的模式和默认的日期格式*/

/*SimpleDateFormat类的常用方法
格式化(从Date到String)
public final String format(Date date)：将日期格式化成日期/时间字符串
解析(从String到Date)
public Date parse(String source)：从给定字符串的开始解析文本以生成日期*/

/*y  Year
* M  Month in year (context sensitive)
* d  Day in month
* H  Hour in day (0-23)
* m  Minute in hour
* s  Second in minute  */