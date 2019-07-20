package chapter6;

import static net.mindview.util.Print.print;

public class ExtendsTest extends Test{
    ExtendsTest() {
        print("This is extends test");
    }

    public static void main(String[] args) {
        new ExtendsTest();
    }
}

class Test {
    Test() {
        print("This is class Test.");
    }
}

