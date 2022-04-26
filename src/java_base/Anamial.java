package java_base;

public abstract class Anamial {
    private String name;
    private int age;

    public Anamial() {
    }

    public Anamial(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //³éÏó·½·¨
    public abstract void eat();
}
