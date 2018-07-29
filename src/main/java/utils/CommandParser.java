package utils;

import commands.Command;
import commands.impl.NotFoundCommandImpl;
import lombok.Data;

import java.util.Map;

@Data
public class CommandParser {
    private Map<String, Command> commands;

    public CommandParser(Map<String, Command> commands) {
        this.commands = commands;
    }

    public Command parseCommand(String command){
        if (commands.containsKey(command)){
            return commands.get(command);
        }
        return new NotFoundCommandImpl();
    }
}
