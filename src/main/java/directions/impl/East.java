package directions.impl;

import directions.Direction;
import grid.Landscape;
import lombok.Data;

@Data
public class East implements Direction {

    private Landscape landscape;

    public East(Landscape landscape) {
        this.landscape = landscape;
    }

    public void move(){
        landscape.moveXForward();
    }

    public Direction turnLeft() {
        return new North(landscape);
    }

    public Direction turnRight() {
        return new South(landscape);
    }

    @Override
    public String toString() {
        return "E";
    }
}
