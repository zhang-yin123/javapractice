package stringDemo;
/*
* �ַ����ָ����
* public String[] split(String regex):���ղ������򣬽��ַ����зֳ����ɲ��֡�
* ע�� split �����Ĳ�����ʵ��һ��������ʽ
* �������Ӣ�ľ��"."�з�,����д��"\\."��������б�ܼӾ�㣩
* */
public class demo05 {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc,wd";
        String[] arr1 = str1.split(",");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        String str2 = "sad sdfdgf etg";
        String[] arr2 = str2.split(" ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        String str3 = "xxx.yyy.zzz";
        String[] arr3 = str3.split("\\.");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        System.out.println("�ҷ�����");
    }
}
