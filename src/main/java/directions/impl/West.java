package directions.impl;

import directions.Direction;
import grid.Landscape;
import lombok.Data;

@Data
public class West implements Direction {

    private Landscape landscape;

    public West(Landscape landscape) {
        this.landscape = landscape;
    }

    public Direction turnLeft() {
        return new South(landscape);
    }

    public Direction turnRight() {
        return new North(landscape);
    }

    public void move() {
        landscape.moveXBackwards();
    }

    @Override
    public String toString() {
        return "W";
    }
}
