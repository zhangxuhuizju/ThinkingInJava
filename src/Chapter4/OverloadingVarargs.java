package Chapter4;

import static net.mindview.util.Print.print;

public class OverloadingVarargs {
    static void f(float i, Character...args) {
        print("first");
    }

    static void f(char c, Character...args) {
        print("second");
    }

    public static void main(String[] args) {
        f('a', 'b');
        f(1, 'c');
    }
}
