package java_base;

public class cat extends Anamial implements Jumpping{
    @Override
    public void eat() {
        System.out.println("Ã¨³ÔÓã");
    }

    @Override
    public void jump() {
        System.out.println("Ã¨Ìø¸ß");
    }

    public cat() {
    }

    public cat(String name, int age) {
        super(name, age);
    }
    public void Catch(){
        System.out.println("×¥ÀÏÊó");
    }
}
