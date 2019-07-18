package Chapter4;

import static net.mindview.util.Print.print;

public class Exercise2 {
    public static void main(String[] args) {
        new TestConstructor();
    }
}

class TestConstructor {
    private String s = "test";

    TestConstructor() {
        print(s);
        print(ss);
        ss = "test++";
        s = "test1";
        print(s);
        print(ss);
    }

    private String ss = "test2";
}