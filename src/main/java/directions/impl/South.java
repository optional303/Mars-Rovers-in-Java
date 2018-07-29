package directions.impl;

import directions.Direction;
import grid.Landscape;
import lombok.Data;

@Data
public class South implements Direction {

    private Landscape landscape;

    public South(Landscape landscape) {
        this.landscape = landscape;
    }

    public void move(){
        landscape.moveYBackwards();
    }

    public Direction turnLeft() {
        return new East(landscape);
    }

    public Direction turnRight() {
        return new West(landscape);
    }

    @Override
    public String toString() {
        return "S";
    }
}
