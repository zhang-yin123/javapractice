package constructor2;
/*
 * �Ҽ�ѡ����ѡ��Sourceѡ��Generate...���ٴ���get set�����͹��췽��
 * 
 * */
public class students {

	private String name;
	private int age;
	public students() {
	}
	public students(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
