package java_base;

public class dog extends Anamial implements Jumpping{
    @Override
    public void eat() {
        System.out.println("������");
    }

    @Override
    public void jump() {
        System.out.println("������");
    }

    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }
    public void lookDoor(){
        System.out.println("����");
    }
}
