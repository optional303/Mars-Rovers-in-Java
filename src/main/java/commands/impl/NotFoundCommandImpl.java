package commands.impl;

import commands.Command;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import rover.impl.Rover;

@Data
@Slf4j
public class NotFoundCommandImpl implements Command {

    public void execute(Rover vehicle){
        log.error("This command is not recognized by the rover!!");
    }
}
