package chapter10;

import static net.mindview.util.Print.print;

//匿名内部类实现工厂方法
interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

//通过让构造方法私有化使得只能内部构造类，利用工厂接口创造实例
class Implementation1 implements Service {
    private Implementation1() {}
    public void method1() {print("Implementation1 method1.");}
    public void method2() {print("Implementation1 method2.");}
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };
}

class Implementation2 implements Service {
    private Implementation2() {}
    public void method1() {print("Implementation2 method1.");}
    public void method2() {print("Implementation2 method2.");}
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };
}

public class Factories {
    public static void serviceConsumer (ServiceFactory factory) {
        Service service = factory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}