package day03api;

import java.util.Scanner;

/*
 Scanner��Ĺ��ܣ�����ʵ�ּ������빦�ܵ������С�
 �������͵�һ��ʹ�ò��裺
 1.����
 import ��·��.������
 �����Ҫʹ�õ�Ŀ���࣬�͵�ǰ��λ��ͬһ�����£������ʡ�Ե�����䲻д
 ֻ��java.lang���µ����ݲ���Ҫ�����������İ�����Ҫimport��䡣
 2.����
 ������ ������ = new ������();
 3.ʹ��
 ������.��Ա������();
 ��ȡ���������һ��int���֣�int num = sc.nextInt();
 ��ȡ���������һ���ַ�����String str = sc.next();
 */


public class scannerdemo {
	public static void main(String[] args) {
//		����
//		System.in����Ӽ�������
		Scanner sc = new Scanner(System.in);
//		��ȡ���������int����
		int num = sc.nextInt();
		System.out.println("�����������"+num);
		
		String str = sc.next();
		System.out.println("������ַ�����"+str);
		sc.close();
	}
}
