package faceObj;

public class study {
	/*
	 * ��Ա����һ��ʹ��private���Σ���ô�����п���������ʣ����ǳ������෶Χ���޷�ֱ�ӷ�����
	 * �����ʾ��Ƕ���getter��setter����
	 * ���ڻ��������е�booleanֵ��getter����Ҫд��isXxx,setter��������
	 * this��˭����this����˭
	*/
	String name;
	int age;
	private String sex;
	private boolean male;
	public void eat() {
		System.out.println("�Է�");
	}
	public void sleep() {
		System.out.println("˯��");
	}
	public void learn() {
		System.out.println("ѧϰ");
	}
	public int[] comput (int a,int b) {
		int[] arr = {a+b,a-b};
		return arr;
	}
//	�����Ա�����޸�sex�������Ʊ����set������������ĸ��д
	public String setSex(String str) {
		sex = str;
		return sex;
	}
//	�����Ա������ȡsex�������Ʊ����get������������ĸ��д
	public String getSex(String str) {
		return sex;
	}
}
