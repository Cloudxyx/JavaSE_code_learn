package java_base.ѧ������sys;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //����ѧ������
        ArrayList<Student> array = new ArrayList<>();
        while (true) {
            System.out.println("--------Welcome student sys--------");
            System.out.println("1 ���ѧ��");
            System.out.println("2 ɾ��ѧ��");
            System.out.println("3 �޸�ѧ��");
            System.out.println("4 �鿴����ѧ��");
            System.out.println("5 �˳���");
            System.out.println("����ѡ��");
            //��������
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
//                    System.out.println("���ѧ��");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("ɾ��ѧ��");
                    break;
                case "3":
                    System.out.println("�޸�ѧ��");
                    break;
                case "4":
                    System.out.println("�鿴ѧ��");
                    findStudent(array);
                    break;
                case "5":
                    System.out.println("�˳�!!!");
                    System.exit(0);
            }
        }
    }
    public static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("����ѧ��");
        String sid = sc.nextLine();
        System.out.println("��������");
        String name = sc.nextLine();
        System.out.println("��������");
        String age = sc.nextLine();
        System.out.println("�����ַ");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setAge(age);
        s.setAddress(address);
        s.setName(name);

        array.add(s);

        System.out.println("���ѧ���ɹ�");
    }
    public static void findStudent(ArrayList<Student> array){
        if (array.size()==0){
            System.out.println("�������ѧ����Ϣ������");
        }else {
            System.out.println("ѧ��\t����\t����\t\t��ַ");
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "��" +"\t"+ s.getAddress());
            }
        }
    }


}
