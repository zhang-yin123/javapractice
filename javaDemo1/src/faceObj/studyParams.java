package faceObj;

public class studyParams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		study student = new study();
		student.age = 20;
		student.name = "����";
		studyMethod(student);
		String sex = student.setSex("��");
		System.out.println("�Ա�"+sex);
	}
	public static void studyMethod (study x) {
		System.out.println(x.age);
		System.out.println(x.name);
	}

}
