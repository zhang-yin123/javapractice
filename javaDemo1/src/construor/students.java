package construor;
/*
 * 构造方法是专门用来创建对象的方法，当我们通过new关键字来创建对象是，就是在调用构造方法
 * 格式：
 * public 类名称(参数类型 参数名称){
 * 方法体
 * }
 * 注意事项：
 * 1.构造方法的名称必须和所在的类名称完全一样，就连大小写也要一样
 * 2.构造方法不要写返回值，连void也不写
 * 3.构造方法不能return返回值、
 * 4.如果没有编写任何构造方法，那么编译器会默认有一个构造方法，没有参数，方法体什么也不做
 * 5.构造方法也可以进行重载
 * */
public class students {
	public students() {
		System.out.println("构造方法执行了");
	}
	public students(String name,int age) {
		System.out.println("我叫"+name +"，今年"+age+"岁");
	}
}
