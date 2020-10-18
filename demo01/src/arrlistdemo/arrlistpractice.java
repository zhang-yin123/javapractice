package arrlistdemo;

import java.util.ArrayList;

/*
* 数组的长度不可以发生改变
* 但是ArrayList集合的长度是可以随意变化的。
*
* 对于ArrarList来说，有一个尖括号<E>代表泛型，就是统一的什么类型
* 泛型只能是引用类型，不能是基本类型
*
* 对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
* 如果内容是空，得到的是空的中括号。
* */
public class arrlistpractice {
    public static void main(String[] args) {
//      从jdk1.7开始，右侧尖括号内部可以不写内容，但是尖括号本身还是要写的
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("赵丽颖");//添加元素
        System.out.println(list);
        list.add("迪丽热巴");
        System.out.println(list);
        list.add("范冰冰");
        System.out.println(list);
    }
}
