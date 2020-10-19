package faceObj;

public class study {
	/*
	 * 成员变量一旦使用private修饰，那么本类中可以随意访问，但是超过本类范围就无法直接访问了
	 * 简介访问就是定义getter和setter方法
	 * 对于基本类型中的boolean值，getter方法要写成isXxx,setter方法不变
	 * this：谁调用this就是谁
	*/
	String name;
	int age;
	private String sex;
	private boolean male;
	public void eat() {
		System.out.println("吃饭");
	}
	public void sleep() {
		System.out.println("睡觉");
	}
	public void learn() {
		System.out.println("学习");
	}
	public int[] comput (int a,int b) {
		int[] arr = {a+b,a-b};
		return arr;
	}
//	这个成员方法修改sex属性名称必须叫set加属性名首字母大写
	public String setSex(String str) {
		sex = str;
		return sex;
	}
//	这个成员方法获取sex属性名称必须叫get加属性名首字母大写
	public String getSex(String str) {
		return sex;
	}
}
