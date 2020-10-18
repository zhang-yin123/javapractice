package randomdemo;

import java.util.Random;
import java.util.Scanner;

/*
* 猜数字
*
* 1.产生一个随机数，一旦产生不在变化，用Random的nextInt方法
* 2.需要键盘输入，用到Scanner的nextInt方法
* 3.判断输入的数字
*   太大了，提示太大了，并且重试
*   太小了，提示太小了，并且重试
*   猜中了游戏结束
*重试循环，次数不确定
*
* */
public class guessnum {
    public static void main(String[] args) {
        Random r = new Random();
        int correctnum = r.nextInt(100) + 1;//1-100
        Scanner sc = new Scanner(System.in);
//        guessgame(correctnum);
        while(true) {
            System.out.println("请输入猜测的数字");
            int guessnum = sc.nextInt();
            if (guessnum > correctnum) {
                System.out.println("太大了，请重试");
            } else if (guessnum < correctnum) {
                System.out.println("太小了，请重试");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
        System.out.println("游戏结束");
        sc.close();

    }
//    public static void guessgame(int correctnum) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入猜测的数字");
//        int guessnum = sc.nextInt();
//        if (guessnum > correctnum) {
//                System.out.println("太大了，请重试");
//                guessgame();
//            } else if (guessnum < correctnum) {
//                System.out.println("太小了，请重试");
//                guessgame();
//            } else {
//                System.out.println("猜对了");
//            }
//    }
}
