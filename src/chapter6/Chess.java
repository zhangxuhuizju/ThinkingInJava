package chapter6;

import static net.mindview.util.Print.print;

class Game {
    Game(int i) {
        print("this is game");
    }
}

class BoardGame extends Game {
    BoardGame(int j) {
        super(1);
        print("this is boardGame");
    }
}
public class Chess  extends BoardGame{
    Chess() {
        super(11);
        print("this is chess");
    }

    public static void main(String[] args) {
        new Chess();
    }
}
