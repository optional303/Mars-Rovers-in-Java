package grid;

public interface Landscape {
    int getCoordinateX();
    int getCoordinateY();

    void moveXForward();
    void moveYForward();

    void moveXBackwards();
    void moveYBackwards();
}
