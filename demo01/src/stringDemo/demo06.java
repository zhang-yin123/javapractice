package stringDemo;

import java.util.Scanner;
/*
* 统计字符串中大写字母小写字母数字和其他类型字符出现次数
* */
public class demo06 {
    public static void main(String[] args) {
        String input;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入");
            input = sc.next();
            sc.close();
        }
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
//            字符发生运算提升为int类型
            if('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countOther++;
            } else {
                countOther++;
            }
        }
        System.out.println("大写字母出现："+countUpper + "次。");
        System.out.println("小写字母出现："+countLower + "次。");
        System.out.println("数字出现："+countNumber + "次。");
        System.out.println("其他字符出现："+countOther + "次。");
    }
}
