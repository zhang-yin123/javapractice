package stringDemo;

import java.util.Scanner;
/*
* ͳ���ַ����д�д��ĸСд��ĸ���ֺ����������ַ����ִ���
* */
public class demo06 {
    public static void main(String[] args) {
        String input;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("������");
            input = sc.next();
            sc.close();
        }
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
//            �ַ�������������Ϊint����
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
        System.out.println("��д��ĸ���֣�"+countUpper + "�Ρ�");
        System.out.println("Сд��ĸ���֣�"+countLower + "�Ρ�");
        System.out.println("���ֳ��֣�"+countNumber + "�Ρ�");
        System.out.println("�����ַ����֣�"+countOther + "�Ρ�");
    }
}
