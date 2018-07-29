package rover.impl;

import commands.Command;
import directions.Direction;
import directions.impl.East;
import directions.impl.North;
import directions.impl.South;
import directions.impl.West;
import grid.Landscape;
import lombok.Data;
import utils.AvailableCommands;
import utils.CommandParser;

import java.util.Map;

@Data
public class Rover {

    private Landscape landscape;
    private Direction direction;

    public Rover(Landscape landscape, String direction) {
        this.landscape = landscape;
        setDirection(direction);
    }

    private void setDirection(String direction){
        if (direction.equals("N")) {
            this.direction = new North(landscape);

        } else if (direction.equals("E")) {
            this.direction = new East(landscape);

        } else if (direction.equals("W")) {
            this.direction = new West(landscape);

        } else if (direction.equals("S")) {
            this.direction = new South(landscape);
        }
    }

    private int getCoordinateX() {
        return landscape.getCoordinateX();
    }

    private int getCoordinateY() {
        return landscape.getCoordinateY();
    }

    public void turnLeft(){
        direction = direction.turnLeft();
    }

    public void turnRight(){
        direction = direction.turnRight();
    }

    public void move(){
        direction.move();
    }

    public void executeCommands(String commandsString){

        Map<String, Command> commands = AvailableCommands.list();
        CommandParser commandParser = new CommandParser(commands);
        char [] commandsArray = commandsString.toCharArray();

        for (char aCommandsArray : commandsArray) {
            String command = String.valueOf(aCommandsArray);
            Command commandToExecute = commandParser.parseCommand(command);
            commandToExecute.execute(this);
        }
    }

    @Override
    public String toString() {
        return String.format("%d %d %s", getCoordinateX(), getCoordinateY(), direction);
    }
}
