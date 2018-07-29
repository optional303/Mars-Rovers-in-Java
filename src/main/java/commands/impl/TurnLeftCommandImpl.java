package commands.impl;

import commands.Command;
import lombok.Data;
import rover.impl.Rover;

@Data
public class TurnLeftCommandImpl implements Command {
    public void execute(Rover vehicle) {
        vehicle.turnLeft();
    }
}
