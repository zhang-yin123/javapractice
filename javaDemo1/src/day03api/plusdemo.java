package day03api;

import java.util.Scanner;

public class plusdemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int num1 = sc.nextInt();
		System.out.println("������ڶ�������");
		int num2 = sc.nextInt();
		System.out.println("�������ֺ�Ϊ:"+(num1 + num2));
		sc.close();
	}
}
