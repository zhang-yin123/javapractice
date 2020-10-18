package arrlistdemo;

import java.util.ArrayList;
import randomdemo.person;

public class arraylistobj {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("洪七公",20);
        Student two = new Student("欧阳锋",21);
        Student three = new Student("黄药师",22);
        Student four = new Student("段智兴",23);

        list.add(one); list.add(two); list.add(three); list.add(four);
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println("姓名"+student.getName() + "，年龄"+student.getAge());
        }
        System.out.println("______________________________________________");
        ArrayList<person> list2 = new ArrayList<>();

        person first = new person("赵丽颖",20);
        person second = new person("迪丽热巴",21);
        person third = new person("高圆圆",22);
        person forth = new person("杨幂",23);

        list2.add(first); list2.add(second); list2.add(third); list2.add(forth);
        for (int i = 0; i < list2.size(); i++) {
            person people = list2.get(i);
            System.out.println("姓名"+people.getName() + "，年龄"+people.getAge());
        }
    }
}
