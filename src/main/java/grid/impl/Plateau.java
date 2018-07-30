package grid.impl;

import grid.Landscape;
import lombok.Data;

@Data
public class Plateau implements Landscape {
    private int coordinateX;
    private int coordinateY;

    private int gridSizeX;
    private int gridSizeY;


    public Plateau(int gridSizeX, int gridSizeY, int startX, int startY) {
        this.coordinateX = startX;
        this.coordinateY = startY;
        this.gridSizeX = gridSizeX;
        this.gridSizeY = gridSizeY;
    }

    public int getCoordinateX() {
        return this.coordinateX;
    }

    public int getCoordinateY() {
        return this.coordinateY;
    }

    public void moveXForward(){
        if (coordinateX < gridSizeX){
            coordinateX++;
        }
    }

    public void moveYForward() {
        if (coordinateY < gridSizeY){
            coordinateY++;
        }
    }

    public void moveXBackwards() {
        if (coordinateX > 0){
            coordinateX--;
        }
    }

    public void moveYBackwards() {
        if (coordinateY > 0){
            coordinateY--;
        }
    }


}
