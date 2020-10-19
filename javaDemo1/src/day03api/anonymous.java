package day03api;

import java.util.Scanner;

public class anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ÄäÃû¶ÔÏó
		int num = new Scanner(System.in).nextInt();
		methodParam(new Scanner(System.in));
		Scanner sc = methodreturn();
		int num2 = sc.nextInt();
		sc.close();
	}
	public static void methodParam(Scanner sc) {
		int num = sc.nextInt();
		System.out.println(num);
	}
	public static Scanner methodreturn() {
		return new Scanner(System.in);
	}
}
