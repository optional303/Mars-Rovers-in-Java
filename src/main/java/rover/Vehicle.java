package rover;

public interface Vehicle {
    void turnLeft();
    void turnRight();
    void move();

    void executeCommands(String commandString);
}
