package java_base;
//ѧ����

public class Student {
    //��Ա����
    private String name;
    private int age;
//    public void setName(String n){
//        name = n;
//    }
    public Student(){
        System.out.println("�޲ι��췽��");
    }
    public Student(String name){
        this.name = name;
    }
    public Student(int age){
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        if (a < 0 || a > 120) {
            System.out.println("age error");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}

