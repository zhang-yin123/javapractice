package stringDemo;

public class demo02 {
    //字符串常量池：程序中直接写上双引号的字符串，就在字符串常量池中
    //基本数据类型比较的是数值
    //引用类型比较的是地址值，new的不在池中
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
