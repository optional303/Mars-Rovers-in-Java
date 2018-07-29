package commands;

import rover.impl.Rover;

public interface Command {
    void execute(Rover vehicle);
}
