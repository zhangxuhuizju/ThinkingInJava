package chapter9;

class A {
    interface B {
        void f();
    }

    public class BImp implements B {
        public void f() {
        }
    }

    private class BImp2 implements B {
        public void f() {
        }
    }

    public interface C {
        void f();
    }

    public class CImp implements C {
        public void f() {
        }
    }
    //只有class内部的接口允许是private的
    private class CImp2 implements C {
        public void f() {
        }
    }

    private interface D {
        void f();
    }

    private class DImp implements D {
        public void f() {

        }
    }

    public class DImp2 implements D {
        public void f() {

        }
    }

    public D getD() {
        return new DImp2();
    }

    private D dRef;

    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}

interface E {
    interface G {
        void f();
    }

    //对于接口内嵌套接口而言，public申明是冗余的，默认只能是public
    public interface H {
        void f();
    }

    void g();

    //接口内部嵌套的接口不允许是private的！！！
    //private interface I{};
}
public class NestingInterfaces {
    public class BImp implements A.B {
        public void f() {}
    }

    class CImp implements A.C {
        public void f() {}
    }

    //不允许在外部的class里实现其他class的私有内部接口
//    class DImp implements A.D {
//        public void f() {}
//    }

    //实现接口的时候不需要实现接口的内部接口
    class EImp implements E {
        public void g() {}
    }

    class EGImp implements E.G {
        public void f() {}
    }

    //嵌套实现接口和接口的内部接口方式
    class EImp2 implements E {
        public void g() {}

        class EG implements E.G {
            public void f() {}
        }
    }

    public static void main(String[] args) {
        A a = new A();
        //A.D是类的内部私有接口，无法访问
        //A.D ad = a.getD();
        //A.DImp2 di2 = a.getD();
        //a.getD().f();
        A a2 = new A();
        //内部私有接口只能由该类的对象进行操作
        a2.receiveD(a.getD());
    }
}
