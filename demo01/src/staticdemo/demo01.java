package staticdemo;
/*
һ������static�ؼ��֣���ô���������ݲ������ڶ����Լ�������������ģ����Է��Ǳ���Ķ��󣬶�����ͬһ��
* */
public class demo01 {
    public static void main(String[] args) {
        Student one = new Student("����",19);
        one.room = "101����";
        System.out.println("����" + one.getName() +"������"+one.getAge() + "������" + one.room + "��ѧ��" + one.getId());
        Student two = new Student("����",16);
        System.out.println("����" + two.getName() +"������"+two.getAge() + "������" + two.room + "��ѧ��" + two.getId());
    }
}
