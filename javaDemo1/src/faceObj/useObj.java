package faceObj;
/*
 * ͨ������£�һ���ಢ����ֱ��ʹ�ã���Ҫ�����ഴ��һ�����󣬲���ʹ�á�
 * 1.������Ҳ����ָ����Ҫʹ�õ��࣬��ʲôλ�á�
 * import ������.������
 * import faceObj.study;
 * ���ں͵�ǰ������ͬһ���������������ʡ�Ե�����䲻д
 * 
 * 
 * 2.����
 * ������ ������ = new ������();
 * study student = new study();
 * 
 * 3.ʹ�ã���Ϊ���������
 * ʹ�ó�Ա������������.��Ա������
 * ʹ�ó�Ա������������.��Ա������(����);
 * �����Ա����û�и�ֵ����ô����һ��Ĭ��ֵ
 * */
public class useObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		study student = new study();
		System.out.println(student.name);//null
		System.out.println(student.age);//0
		student.eat();
	}

}
