package stringDemo;

public class demo02 {
    //�ַ��������أ�������ֱ��д��˫���ŵ��ַ����������ַ�����������
    //�����������ͱȽϵ�����ֵ
    //�������ͱȽϵ��ǵ�ֵַ��new�Ĳ��ڳ���
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] arr1 = {'a','b','b'};
        String str3 = new String(arr1);
        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str2 == str3);//false
    }
}
