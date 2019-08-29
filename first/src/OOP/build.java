package OOP;

public class build {
    public static void main(String[] args) {
        People p = new People("xiaoming", 18);
        System.out.printf("%s 的年龄为 %d", p.getName(), p.getAge());
    }
}

class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People(String name) {
        this(name, 18); // 调用另一个构造方法Person(String, int)
    }

    public People() {
        this("Default name"); // 调用另一个构造方法Person(String)
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}