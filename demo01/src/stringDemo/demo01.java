package stringDemo;
/*
*  java.lang.String类代表字符串。
*API中，java程序中所有字符串字面值如"abc"都是此类的对象。
*
* 字符串特点：
* 1.字符串内容永不可变
* 2.因为字符串不可改变，所以字符串是可以共享使用的。
* 3.字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组
*
* 创建字符串的3+1种方式
* 三种构造方法：
* public String():创建一个空白字符串，不含任何内容。
* public String(char[] array):根据字符数组内容，来创建对应字符串，字符型数据单个引号就是字符型如'z,'Z','中'...
* public String(byte[] array):根据字节数组内容，来创建对应字符串
* 一种直接创建：
*
* */
public class demo01 {
    public static void main(String[] args) {
        String str1 = new String();//小括号留空，说明字符串什么内容也没有
        System.out.println("第一个字符串"+str1);
        //根据字符数组创建字符串
        char[] arr1 = {'A','B','C'};
        String str2 = new String(arr1);
        System.out.println("第二个字符串"+str2);
        //根据字节数组创建字符串
        byte[] byteArray = {97,98,103};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串"+str3);
        //直接创建
        String str4 = "hello";
        System.out.println("第四个字符串"+str4);
    }
}
