
import controller.Controller;
import model.ComputerBrainModel;
import view.View;

/**
 * Main Class. Start up game.
 *
 * @author Anastasia Milinchuk
 * @since 10/30/2016.
 */
public class Main {
    /**
     * Start of interval which uses for generating secret number
     */
    public static final int X_RANGE = 0;
    /**
     * End of interval which uses for generating secret number
     */
    public static final int Y_RANGE = 100;

    /**
     * Start up game
     * @param args is arguments from command line
     */
    public static void main(String args[]){
        ComputerBrainModel model = new ComputerBrainModel(X_RANGE, Y_RANGE);
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.start();
    }
}
