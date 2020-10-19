package faceObj;
/*
 * 通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。
 * 1.导包；也就是指出需要使用的类，在什么位置。
 * import 包名称.类名称
 * import faceObj.study;
 * 对于和当前类属于同一个包的情况，可以省略导包语句不写
 * 
 * 
 * 2.创建
 * 类名称 对象名 = new 类名称();
 * study student = new study();
 * 
 * 3.使用，分为两种情况、
 * 使用成员变量；对象名.成员变量名
 * 使用成员方法；对象名.成员方法名(参数);
 * 如果成员变量没有赋值，那么会有一个默认值
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
