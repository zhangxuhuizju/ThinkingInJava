package chapter10;

import sun.security.krb5.internal.crypto.Des;

import static net.mindview.util.Print.print;

class Destination {
    private String label = "dest";

    public String readLabel() {
        return label;
    }
}

public class Parcel {
    private void readDestination(Destination destination) {
        print(destination.readLabel());
    }

    //匿名内部类可以扩展类，但是如果要用到传递的参数，如本例中的dest，则dest必须是final或者效果上是final的
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;

            public String readLabel() {
                return label + "sss";
            }
        };
    }

    public static void main(String[] args) {
        Destination hello = new Parcel().destination("hello");
        new Parcel().readDestination(hello);
        new Parcel().readDestination(new Destination());
    }
}
