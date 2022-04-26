package java_base;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("xxx");
        s.setAge(30);
        s.show();

        Student s2 = new Student("xxx");
        Student s3 = new Student(39);
        s2.show();
        s3.show();
    }
}
