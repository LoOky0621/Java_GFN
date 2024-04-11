package uebung3;

import java.awt.*;

public class Bot {

    private Direction direction = Direction.EAST;

    //private int x;
    //private int y;

    private Point pos = new Point();


    public boolean move(String step) {

        switch(step) {
            case ">": return false;
            case "<": return false;

            case "r":
                direction = Compass.right(direction);
                return true;

            case "l":
                direction = Compass.left(direction);
                return true;

            default: return false;
        }
    }

    public Point getPos() {
        return pos;
    }
}
