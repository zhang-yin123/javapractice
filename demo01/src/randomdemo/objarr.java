package randomdemo;

public class objarr {
    public static void main(String[] args) {
        person[] array = new person[3];
        person one = new person("张三",20);
        person two = new person("李四",19);
        person three = new person("王五",22);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[1].getName());
    }
}
