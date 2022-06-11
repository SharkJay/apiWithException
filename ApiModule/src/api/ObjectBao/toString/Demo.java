package api.ObjectBao.toString;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 12);
        Student s2 = new Student("张三", 12);

        System.out.println(s1);
        System.out.println(s1.toString());

        System.out.println(s1.equals(s2));
    }
}
