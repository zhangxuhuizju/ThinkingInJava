package chapter6;

import static net.mindview.util.Print.print;

class WithFinals {
    private final void f() {
        print("withfinals.f()");
    }

    private void g() {
        print("withfinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        print("override.f()");
    }

    private void g() {
        print("override.g()");
    }
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate o = new OverridingPrivate();
    }
}
