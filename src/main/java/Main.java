import java.controller.Controller;
import model.ComputerBrainModel;
import view.View;

/**
 * Created by click on 10/30/2016.
 */
public class Main {
    public static final int X_RANGE = 0;
    public static final int Y_RANGE = 100;

    public static void main(String args[]){
        ComputerBrainModel model = new ComputerBrainModel(X_RANGE, Y_RANGE);
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.start();
    }
}
