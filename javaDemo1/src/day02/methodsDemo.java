package day02;


/*
 * 定义方法完整格式
 * 修饰符 返回值类型 方法名称(参数类型，参数名称，...){
 * 	方法体
 * return 返回值
 * }
 * 
 * 修饰符：现阶段固定写法,public static
 * 有void 就不能写返回值
 * 
 * 方法1调用的三种格式
 * 1.单独调用：方法名称(参数);
 * 2.打印调用：System.out.prinyln(方法名称(参数);
 * 3.赋值调用：数据类型 变量名称 = 方法名称(参数);
 * 注意：返回值类型写为void,这种方法只能单独调用，不能进行打印调用或赋值
 * 
 * 方法重载：多个方法名称一样，但是参数列表不一样
 * 方法重载与下列因素相关
 * 1.参数个数不同
 * 2.参数类型不同
 * 3.参数多类型顺序不同
 * 
 * 方法重载与下列因素无关
 * 1.与参数名称无关
 * 2.与方法返回值类型无关
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
