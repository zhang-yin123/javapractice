package stringDemo;
/*
* 字符串分割方法：
* public String[] split(String regex):按照参数规则，将字符串切分成若干部分。
* 注意 split 方法的参数其实是一个正则表达式
* 如果按照英文句点"."切分,必须写成"\\."（两个反斜杠加句点）
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
        System.out.println("我反而更");
    }
}
