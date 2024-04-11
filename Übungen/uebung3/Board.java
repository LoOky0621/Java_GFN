package uebung3;

import java.awt.*;

public class Board {

    private final Bot[][] FIELDS;

    public Board(int size) {
        this.FIELDS = new Bot[size][size];
    }

    public void print() {
        for(Bot[] rows : FIELDS) {
            for(Bot col : rows) {
                if(col == null) System.out.print(" [ ]");
                else System.out.print(" [@]");
            }
            System.out.println();
        }
    }

    public boolean set(Bot bot) {
        Point pos = bot.getPos();
        FIELDS[pos.x][pos.y] = bot;
        // TODO: Position auf Gültigkeit prüfen
        return true;
    }
}
