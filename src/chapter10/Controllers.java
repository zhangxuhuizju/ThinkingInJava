package chapter10;

import java.util.*;

import static net.mindview.util.Print.print;

public class Controllers {
    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event c) {
        eventList.add(c);
    }
    public void run() {
        while (eventList.size() > 0) {
            //防止修改list中的内容，对其做一个拷贝
            for (Event e : new ArrayList<>(eventList)) {
                if (e.ready()) {
                    print(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
