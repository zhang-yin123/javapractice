package day02;

/*
 * 数组的特点：
 * 数组是一种引用数据类型
 * 数组当中的多个数据，类型必须统一
 * 数组的长度在程序运行期间不可改变
 * 
 * 数组的初始化方式
 * 1.动态初始化（指定长度）
 * 2.静态初始化（指定内容）
 * 
 * 动态初始化数组格式;
 * 数据类型[] 数组名称 = new 数据类型[数组长度]
 * 静态初始化的基本格式：
 * 标准格式： 数据类型[] 数组名称 = new 数据类型 []{元素1,元素2,...}
 * 省略格式：数据类型[] 数组名称 = {元素1,元素2,...}
 * 静态初始化可以拆分成两个步骤,使用省略格式就不能拆成两个步骤
 * 动态初始化也可以拆成两个步骤
 * */
/*
 * 直接打印数组名称，得到的是数组对应的内存地址哈希值。
 * 访问数组元素的格式；数组名称[索引值]
 * 索引从0开始
 * 
 * 
 * 
 * 使用动态初始化数据的时候，其中的元素会自动拥有一个默认值，规则如下
 * 如果是整数型，默认0
 * 如果是浮点型，默认0.0
 * 如果是字符型，默认为'\u0000'
 * 如果是布尔型，默认为false
 * 如果是引用类型，默认为null
 * */
public class arrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[10];
		System.out.println(arr1);
		int[] arr2 = new int[] {4,6,9};
		System.out.println(arr2);
		
		int[] arr3 = {2,4,6};
		
		int[] arr4;
		arr4 = new int[] {3,6,7,8,20,89,23};
		System.out.println(arr3[0]);
		System.out.println(arr4[2]);
		System.out.println("=========================");
		int[] arr5 = reverse(arr4);
		printArr(arr5);
		printArr(arr4);
	}
	public static int[] reverse (int[] arr) {
		for(int min = 0,max = arr.length - 1;min < max;min++,max--) {
			int temp = arr[min];
			arr[min] = arr[max];
			arr[max] = temp;
		}
		return arr;
	}
	public static void printArr (int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
