package day02;


/*
 * ���巽��������ʽ
 * ���η� ����ֵ���� ��������(�������ͣ��������ƣ�...){
 * 	������
 * return ����ֵ
 * }
 * 
 * ���η����ֽ׶ι̶�д��,public static
 * ��void �Ͳ���д����ֵ
 * 
 * ����1���õ����ָ�ʽ
 * 1.�������ã���������(����);
 * 2.��ӡ���ã�System.out.prinyln(��������(����);
 * 3.��ֵ���ã��������� �������� = ��������(����);
 * ע�⣺����ֵ����дΪvoid,���ַ���ֻ�ܵ������ã����ܽ��д�ӡ���û�ֵ
 * 
 * �������أ������������һ�������ǲ����б�һ��
 * ���������������������
 * 1.����������ͬ
 * 2.�������Ͳ�ͬ
 * 3.����������˳��ͬ
 * 
 * �������������������޹�
 * 1.����������޹�
 * 2.�뷽������ֵ�����޹�
 * 
 * 
 * */
public class methodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(12,13,4));
		System.out.println(2 == 2.0);
	}
	public static int sum (int a,int b) {
		return a + b;
	}
	public static int sum (int a,int b,int c) {
		return a + b + c;
	}
	public static int sum (int a,int b,int c, int d) {
		return a + b + c + d;
	}
}
