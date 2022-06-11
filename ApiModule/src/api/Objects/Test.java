package api.Objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {

        //public static String toString(对象) 返回参数中对象的字符串表示形式。
        Student s1 = new Student("张飞", 23);
        String result = Objects.toString(s1);
        System.out.println(result);

        //public static String toString(对象, 默认字符串) 返回对象的字符串表示形式。
        Student s2 = null;
        String result2 = Objects.toString(s2, "默认字符串");
        System.out.println(result2);

        //public static Boolean isNull(对象) 判断对象是否为空
        Student s3 = null;
        System.out.println(Objects.isNull(s3));

        //public static Boolean nonNull(对象) 判断对象是否不为空
        Student s4 = null;
        System.out.println(Objects.nonNull(s4));

    }
}
/*public static String toString(对象) 返回参数中对象的字符串表示形式。
public static String toString(对象, 默认字符串) 返回对象的字符串表示形式。
public static Boolean isNull(对象) 判断对象是否为空
public static Boolean nonNull(对象) 判断对象是否不为空*/