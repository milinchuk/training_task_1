package view;

/**
 * Created by click on 10/30/2016.
 */
public class View {
    public final String ERROR = "Error: ";
    public final String START = "Welcome to Less-More game! I've thinked about a number and you must to guess it. ";
    public final String RANGE = "Number I've thinked lie in range: ";
    public final String WIN = "Congratulations! You are winner :)";

    public View() {
    }

    public void showResult(String message){
        System.out.println(message);
    }

    public void showStart(){
        System.out.println(START);
    }

    public void showRange(String range){
        System.out.println(RANGE + range);
    }

    public void showWin(){
        System.out.println(WIN);
    }

    public void showError(String error){
        System.out.println(ERROR + error);
    }

    public void showAttempts(String attemptsList) {
        System.out.println("Attempts : " + attemptsList);
    }
}
