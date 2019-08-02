package chapter10;

import static net.mindview.util.Print.print;

interface Selector {
    boolean end();

    Object current();

    void next();
}

//内部类天然可以访问外部类的所有成员，具有指向外部类的指针。因此创建时必须先有外部类对象。static除外
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        this.items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length)
                i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; ++i)
            sequence.add(Integer.toBinaryString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            print(selector.current());
            selector.next();
        }
    }
}
