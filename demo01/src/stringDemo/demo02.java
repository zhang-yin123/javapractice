package stringDemo;

public class demo02 {
    //字符串常量池：程序中直接写上双引号的字符串，就在字符串常量池中
    //基本数据类型比较的是数值
    //引用类型比较的是地址值，new的不在池中
    //推荐常量.equals();如："ooo".equals(str)
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] arr1 = {'a','b','c'};
        String str3 = new String(arr1);
        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str2 == str3);//false
        /*
        * ==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法；
        * public boolean equals(Object obj);参数可以是任何对象，只有参数是一个字符串并且内容相同才会返回true，否则false
        * 任何对象都可以用Object进行接收
        * */
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println("Abc".equalsIgnoreCase("abc"));//true 不区分英文大小写
    }
}
