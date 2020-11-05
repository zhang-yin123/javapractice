package staticdemo;

public class Student {
    private int id;//学号
    private String name;
    private int age;
    static  String room;
    private static  int counter = 0;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++counter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
