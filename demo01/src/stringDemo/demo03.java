package stringDemo;
/*
*String���÷���
* public int length();��ȡ�ַ������к��е��ַ��������õ��ַ������ȡ�
* public String concat(String str);����ǰ�ַ����Ͳ����ַ���ƴ�ӳ�Ϊ����ֵ�µ��ַ�����
* public char charAt(int index);��ȡָ������λ�õĵ����ַ�����������0��ʼ
* public int indexOf(String str)���Ҳ����ַ����ڱ��ַ��������״γ��ֵ�����λ�á����û�з���-1
* */
public class demo03 {
    public static void main(String[] args) {
        //��ȡ�ַ�������
        int len = "riougrtighrehtyj".length();
        System.out.println("����"+len);
        //ƴ���ַ���
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);//Hello
        System.out.println(str2);//World
        System.out.println(str3);//HelloWorld

        //��ȡָ������λ�õĵ����ַ�
        char ch = "Hello".charAt(1);
        System.out.println("1������λ����"+ch);

        //���Ҳ����ַ����ڱ����ַ������г��ֵĵ�һ������λ��
        // û�з���-1
        String original = "HelloWorld";
        int index = original.indexOf("llo");
        System.out.println("llo����Ϊ"+index);
    }
}
