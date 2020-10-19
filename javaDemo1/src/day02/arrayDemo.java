package day02;

/*
 * ������ص㣺
 * ������һ��������������
 * ���鵱�еĶ�����ݣ����ͱ���ͳһ
 * ����ĳ����ڳ��������ڼ䲻�ɸı�
 * 
 * ����ĳ�ʼ����ʽ
 * 1.��̬��ʼ����ָ�����ȣ�
 * 2.��̬��ʼ����ָ�����ݣ�
 * 
 * ��̬��ʼ�������ʽ;
 * ��������[] �������� = new ��������[���鳤��]
 * ��̬��ʼ���Ļ�����ʽ��
 * ��׼��ʽ�� ��������[] �������� = new �������� []{Ԫ��1,Ԫ��2,...}
 * ʡ�Ը�ʽ����������[] �������� = {Ԫ��1,Ԫ��2,...}
 * ��̬��ʼ�����Բ�ֳ���������,ʹ��ʡ�Ը�ʽ�Ͳ��ܲ����������
 * ��̬��ʼ��Ҳ���Բ����������
 * */
/*
 * ֱ�Ӵ�ӡ�������ƣ��õ����������Ӧ���ڴ��ַ��ϣֵ��
 * ��������Ԫ�صĸ�ʽ����������[����ֵ]
 * ������0��ʼ
 * 
 * 
 * 
 * ʹ�ö�̬��ʼ�����ݵ�ʱ�����е�Ԫ�ػ��Զ�ӵ��һ��Ĭ��ֵ����������
 * ����������ͣ�Ĭ��0
 * ����Ǹ����ͣ�Ĭ��0.0
 * ������ַ��ͣ�Ĭ��Ϊ'\u0000'
 * ����ǲ����ͣ�Ĭ��Ϊfalse
 * ������������ͣ�Ĭ��Ϊnull
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
