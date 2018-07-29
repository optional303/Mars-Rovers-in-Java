package utils;

import commands.Command;
import commands.impl.ForwardCommandImpl;
import commands.impl.TurnLeftCommandImpl;
import commands.impl.TurnRightCommandImpl;

import java.util.HashMap;
import java.util.Map;

public class AvailableCommands {
    public static Map<String, Command> list(){
        Map<String, Command> availableCommands = new HashMap<String, Command>();
        availableCommands.put("L", new TurnLeftCommandImpl());
        availableCommands.put("R", new TurnRightCommandImpl());
        availableCommands.put("M", new ForwardCommandImpl());

        return availableCommands;
    }
}
