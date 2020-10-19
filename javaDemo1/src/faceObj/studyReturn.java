package faceObj;

public class studyReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		study student = getStudent();
		System.out.println(student.age);
		System.out.println(student.name);
		int[] arr = student.comput(10,20);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr);
	}
	public static study getStudent() {
		study student = new study();
		student.age = 20;
		student.name = "laozhang";
		return student;
	}

}
