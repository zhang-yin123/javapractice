package staticdemo;
/*
* 一旦使用了static修饰成员方法，那么这就成为了静态方法。静态方法属于类。
*
* 如果没有static关键字，那么必须先创建对象，然后通过对象才能使用它
* 如果有了static关键字，那么不需要创建对象，直接就能通过类名称使用它
*
* 无论成员变量，还是成员方法，如果有了static，都推荐使用类名称进行调用
* 静态变量：类名称.静态变量
* 静态方法：类名称.静态方法
*
* 注意事项
*   1.静态只能直接访问静态，不能直接访问非静态。
*   原因：在内存当中是【先】有的静态内容，【后】有的非静态内容。
*    “先人不知道后人，但是后人知道先人“
*   2.静态方法中不能用this
*   原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。
* */
public class twoclass {
    public static void main(String[] args) {
        onecClass obj = new onecClass();//创建对象
        //然后才能使用没有static关键字的内容
        obj.method();
        //对于静态方法来说，可以通过对象名调用也可以通过类名称调用
        obj.methodStatic(); //正确，不推荐，这种写法在编译之后也会被javac翻译为类名称.静态方法名
        onecClass.methodStatic();//正确，推荐
        myMethod();//对于本类当中的静态方法，可以省略类名称
        twoclass.myMethod(); //完全等效
    }

    public static void myMethod() {
        System.out.println("自己内部调用的方法");
    }
}
