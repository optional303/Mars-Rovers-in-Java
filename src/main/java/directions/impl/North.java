package directions.impl;

import directions.Direction;
import grid.Landscape;
import lombok.Data;

@Data
public class North implements Direction {

    private Landscape landscape;

    public North (Landscape landscape) {
        this.landscape = landscape;
    }

    public void move(){
        landscape.moveYForward();
    }

    public Direction turnLeft() {
        return new West(landscape);
    }

    public Direction turnRight() {
        return new East(landscape);
    }

    @Override
    public String toString() {
        return "N";
    }
}
