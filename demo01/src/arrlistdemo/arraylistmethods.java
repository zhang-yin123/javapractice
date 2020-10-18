package arrlistdemo;

import java.util.ArrayList;

/*
    ArrayList常用方法
    public boolean add<E e>向集合中添加元素，参数类型和泛型一直，返回值代表添加是否成功。
    对于ArrayList集合来说，add添加动作一点是成功的，返回值可用可不用。
    但是对于其他集合来说，add添加动作不一定成功

    public E get(int index):从集合中获取元素，参数是索引编号，返回值是对应位置元素
    public E remove(inr index):从集合中删除元素，参数是索引编号，返回值是被删掉的元素。
    public int size();获取集合尺寸长度，返回值是集合中包含的元素个数

 */
public class arraylistmethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean success = list.add("柳岩");
        System.out.println(success);
        list.add("高圆圆"); list.add("赵又廷"); list.add("李小璐"); list.add("贾乃亮");
        System.out.println(list);
        //从集合中获取元素：get
        System.out.println("2号索引位置"+list.get(2));
        String removed = list.remove(3);
        System.out.println("被删除元素"+removed);
        System.out.println(list);
        int size = list.size();//获取集合长度
        System.out.println("集合长度为"+size);
    }
}
