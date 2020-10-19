package faceObj;

public class studyParams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		study student = new study();
		student.age = 20;
		student.name = "老张";
		studyMethod(student);
		String sex = student.setSex("男");
		System.out.println("性别"+sex);
	}
	public static void studyMethod (study x) {
		System.out.println(x.age);
		System.out.println(x.name);
	}

}
