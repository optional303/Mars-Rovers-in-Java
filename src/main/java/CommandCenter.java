import grid.Landscape;
import grid.impl.Plateau;
import rover.impl.Rover;



public class CommandCenter {

    public static void main(String[] args) {


        Landscape grid1 = new Plateau(5, 5, 1, 2);
        Rover marsRover1 = new Rover(grid1, "N");
        marsRover1.executeCommands("LMLMLMLMM");
        System.out.println(marsRover1.toString());


        Landscape grid2 = new Plateau(5, 5, 3, 3);
        Rover marsRover2 = new Rover(grid2, "E");
        marsRover2.executeCommands("MMRMMRMRRM");
        System.out.println(marsRover2.toString());

    }
}
