package stringDemo;
/*
* public String substring(int index),截取从参数位置一直到字符串末尾，返回新字符串。
* public String subString(int begin,int end),截取从begin开始，一直到end结束中间的字符串，包含左边不包含右边,[begin,end)
* */
public class demo04 {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);//HelloWorld
        System.out.println(str2);//World,新字符串
        System.out.println("==========");
        /*
        * public char[] toCharArray();将当前字符串拆分成为字符数组作为返回值。
        * punlic byte[] getBytes();获得当前字符串底层的字节数组。
        * public String replace(CharSequence oldString,CharSequence newString)
        * 将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串
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
