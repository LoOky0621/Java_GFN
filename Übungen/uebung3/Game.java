package uebung3;

public class Game {

    public static void main(String[] args) {

        Bot bot = new Bot();

        Board board = new Board(20);
        board.set(bot);

        board.print();

    }
}
