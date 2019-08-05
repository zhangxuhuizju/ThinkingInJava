package chapter10;

import static net.mindview.util.Print.print;

class Egg {
    protected class Yolk {
        public Yolk() {
            print("Egg.yolk().");
        }

        public void f() {
            print("Egg.yolk.f().");
        }
    }

    private Yolk y = new Yolk();

    public Egg() {
        print("New Egg().");
    }

    public void insertYolk(Yolk yy) {
        y = yy;
    }

    public void g() {
        y.f();
    }
}

public class BigEgg extends Egg{
    public class Yolk extends Egg.Yolk {
        public Yolk() {
            print("BigEgg.yolk().");
        }

        public void f() {
            print("BigEgg.yolk.f().");
        }
    }

    public BigEgg() {
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        Egg e = new BigEgg();
        e.g();
    }
}
