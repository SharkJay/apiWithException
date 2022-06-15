package 异常.异常练习;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {

        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        student.setName(name);
        while(true){
            System.out.println("请输入年龄：");
            String ageStr = sc.nextLine();

            try {
                int age = Integer.parseInt(ageStr);
                student.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入整数！");
                continue;
            }catch(AgeOutOfBoundsException e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());

                System.out.println("请输入符合范围的整数！");
                continue;
            }

            /*if(age >= 18 && age <= 25){
                student.setAge(age);
                break;
            }else{
                System.out.println("年龄不在范围内，请输入符合要求的年龄！");
                continue;//跳过本次循环，继续执行下一次循环
            }*/
        }

        System.out.println(student);
    }
}
