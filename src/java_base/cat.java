package java_base;

public class cat extends Anamial implements Jumpping{
    @Override
    public void eat() {
        System.out.println("è����");
    }

    @Override
    public void jump() {
        System.out.println("è����");
    }

    public cat() {
    }

    public cat(String name, int age) {
        super(name, age);
    }
    public void Catch(){
        System.out.println("ץ����");
    }
}
