package java_base.学生管理sys;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //定义学生集合
        ArrayList<Student> array = new ArrayList<>();
        while (true) {
            System.out.println("--------Welcome student sys--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出！");
            System.out.println("输入选择：");
            //输入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
//                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("删除学生");
                    break;
                case "3":
                    System.out.println("修改学生");
                    break;
                case "4":
                    System.out.println("查看学生");
                    findStudent(array);
                    break;
                case "5":
                    System.out.println("退出!!!");
                    System.exit(0);
            }
        }
    }
    public static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入学号");
        String sid = sc.nextLine();
        System.out.println("输入姓名");
        String name = sc.nextLine();
        System.out.println("输入年龄");
        String age = sc.nextLine();
        System.out.println("输入地址");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setAge(age);
        s.setAddress(address);
        s.setName(name);

        array.add(s);

        System.out.println("添加学生成功");
    }
    public static void findStudent(ArrayList<Student> array){
        if (array.size()==0){
            System.out.println("请先添加学生信息！！！");
        }else {
            System.out.println("学号\t姓名\t年龄\t\t地址");
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁" +"\t"+ s.getAddress());
            }
        }
    }


}
