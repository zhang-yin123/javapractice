package stringDemo;
/*
*  java.lang.String������ַ�����
*API�У�java�����������ַ�������ֵ��"abc"���Ǵ���Ķ���
*
* �ַ����ص㣺
* 1.�ַ������������ɱ�
* 2.��Ϊ�ַ������ɸı䣬�����ַ����ǿ��Թ���ʹ�õġ�
* 3.�ַ���Ч�����൱����char[]�ַ����飬���ǵײ�ԭ����byte[]�ֽ�����
*
* �����ַ�����3+1�ַ�ʽ
* ���ֹ��췽����
* public String():����һ���հ��ַ����������κ����ݡ�
* public String(char[] array):�����ַ��������ݣ���������Ӧ�ַ������ַ������ݵ������ž����ַ�����'z,'Z','��'...
* public String(byte[] array):�����ֽ��������ݣ���������Ӧ�ַ���
* һ��ֱ�Ӵ�����
*
* */
public class demo01 {
    public static void main(String[] args) {
        String str1 = new String();//С�������գ�˵���ַ���ʲô����Ҳû��
        System.out.println("��һ���ַ���"+str1);
        //�����ַ����鴴���ַ���
        char[] arr1 = {'A','B','C'};
        String str2 = new String(arr1);
        System.out.println("�ڶ����ַ���"+str2);
        //�����ֽ����鴴���ַ���
        byte[] byteArray = {97,98,103};
        String str3 = new String(byteArray);
        System.out.println("�������ַ���"+str3);
        //ֱ�Ӵ���
        String str4 = "hello";
        System.out.println("���ĸ��ַ���"+str4);
    }
}
