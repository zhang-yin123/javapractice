package stringDemo;

public class demo02 {
    //�ַ��������أ�������ֱ��д��˫���ŵ��ַ����������ַ�����������
    //�����������ͱȽϵ�����ֵ
    //�������ͱȽϵ��ǵ�ֵַ��new�Ĳ��ڳ���
    //�Ƽ�����.equals();�磺"ooo".equals(str)
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] arr1 = {'a','b','c'};
        String str3 = new String(arr1);
        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str2 == str3);//false
        /*
        * ==�ǽ��ж���ĵ�ֵַ�Ƚϣ����ȷʵ��Ҫ�ַ��������ݱȽϣ�����ʹ������������
        * public boolean equals(Object obj);�����������κζ���ֻ�в�����һ���ַ�������������ͬ�Ż᷵��true������false
        * �κζ��󶼿�����Object���н���
        * */
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println("Abc".equalsIgnoreCase("abc"));//true ������Ӣ�Ĵ�Сд
    }
}
