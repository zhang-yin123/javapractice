package randomdemo;

import java.util.Random;

public class randompractice {
    public static void main(String[] args) {
        Random r = new Random();
        for(int i = 0;i < 10;i++) {
            int num = r.nextInt(11);//左开右闭
            System.out.println(num);
        }
    }
}
