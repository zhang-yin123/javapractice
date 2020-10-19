package day03api;

import java.util.Scanner;

public class plusdemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数字");
		int num2 = sc.nextInt();
		System.out.println("两个数字和为:"+(num1 + num2));
		sc.close();
	}
}
