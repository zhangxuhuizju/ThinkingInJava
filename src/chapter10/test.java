package chapter10;

public class test {
    class c {}

    //从外部类的静态方法创建某个内部类的对象必须具体指明OutClassName.InnerClassName
    public static void main(String[] args) {
        c cc = new test().new c();
        test tt = new test();
    }
}
