package chapter10;

import org.jetbrains.annotations.NotNull;

class WithInner {
    class Inner {}
}

public class InheritInner extends WithInner.Inner{
    //继承内部类的时候，必须要给予外部类对象的引用
    InheritInner(@NotNull WithInner wi) {
        wi.super();
    }
}
