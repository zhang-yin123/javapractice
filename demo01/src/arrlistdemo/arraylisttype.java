package arrlistdemo;

import java.util.ArrayList;

/*
如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的包装类

基本类型    包装类（引用类型，包装类都位于java.lang包下）
byte        Byte
short       Short
int         Integer 【特殊】
long        Long
float       Float
double      Double
char        Character 【特殊】
boolean     Boolean

从jdk1.5+开始，支持自动装箱、自动拆箱。

自动装箱：基本类型 --> 包装类型
自动拆箱：包装类型 --> 基本类型
 */
public class arraylisttype {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(300);
        System.out.println(list);
        int num = list.get(1);
        System.out.println(num);
    }
}
