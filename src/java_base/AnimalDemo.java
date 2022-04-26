package java_base;

public class AnimalDemo {
    public static void main(String[] args) {
       Anamial a = new cat("add",55);
        a.eat();
        Jumpping c= new cat();
        c.jump();
        cat c2 = new cat();
        c2.eat();
        c2.jump();

        Jumppingop jo = new Jumppingop();
        //匿名内部类
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫跳高");
            }
        });
    }
}
