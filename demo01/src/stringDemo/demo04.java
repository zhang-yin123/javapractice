package stringDemo;
/*
* public String substring(int index),��ȡ�Ӳ���λ��һֱ���ַ���ĩβ���������ַ�����
* public String subString(int begin,int end),��ȡ��begin��ʼ��һֱ��end�����м���ַ�����������߲������ұ�,[begin,end)
* */
public class demo04 {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);//HelloWorld
        System.out.println(str2);//World,���ַ���
        System.out.println("==========");
        /*
        * public char[] toCharArray();����ǰ�ַ�����ֳ�Ϊ�ַ�������Ϊ����ֵ��
        * punlic byte[] getBytes();��õ�ǰ�ַ����ײ���ֽ����顣
        * public String replace(CharSequence oldString,CharSequence newString)
        * �����г��ֵ����ַ����滻��Ϊ�µ��ַ����������滻֮��Ľ�����ַ���
        *
        * */
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);//H
        System.out.println(chars.length);
        String str3 = "How do you do";
        String str4 = str3.replace("o","*");
        System.out.println(str3);//How do you do
        System.out.println(str4);//H*w d* y*u d*
    }
}
