package arrlistdemo;

import java.util.ArrayList;
import java.util.Random;

public class arraylistreturn {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        Random r = new Random();
        for(int i = 0;i <20; i++) {
            int num = r.nextInt(100) + 1;
            listA.add(num);
        }
        System.out.println(listA);
        ArrayList<Integer> list = evenlist(listA);
        System.out.println(list);
    }
    public static ArrayList<Integer> evenlist (ArrayList<Integer> list) {
        ArrayList<Integer> listB = new ArrayList<>();
        for(int i = 0;i < list.size();i++) {
            int num = list.get(i);
            if(num % 2 == 0) {
                listB.add(num);
            }
        }
        return listB;
    }
}
