package controller;

import model.ComputerBrainModel;
import model.entity.Error;
import model.entity.Result;
import model.validators.NumberValidator;
import view.View;

import java.util.Scanner;


/**
 * Controlling main operations in game
 *
 * @author Anastasia Milinchuk
 * @since 10/30/2016.
 */
public class Controller {
    /**
     * Computer brain model. Main logic in game
     */
    private ComputerBrainModel model;

    /**
     * View for presentation data
     */
    private View view;

    /**
     * Initialize new Controller
     *
     * @param model {@link ComputerBrainModel} main logic of game.
     */
    public Controller(ComputerBrainModel model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Start new 'session' of game. Greeting, telling rules and start playing
     */
    public void start(){
        view.showStart();
        view.showRange(model.getRange());
        play();
    }

    /**
     * Main body of playing game. Input number from user and controll answer from computer
     */
    public void play(){
        Result result = new Result();

        do{
            String input = askNextNumber();
            Error error = new Error();
            NumberValidator.dataValidate(input, model.getX(), model.getY(), error);
            if(error.hasError()){
                view.showError(error.getMessage());
            }else {
                int number = Integer.parseInt(input);
                retreiveResult(number, result);
            }
        } while(!result.isCorrect());

        view.showWin();
        view.showAttempts(result.getAttemptList().toString());
    }

    /**
     * Retrieve answer from computer and show result
     *
     * @param number is input user data
     * @param result {@link Result} data with attempts and current result of users attempt
     */
    private void retreiveResult(int number, Result result){
        model.check(number, result);
        view.showResult(result.getAttempt().getMessage());
        view.showAttempts(result.getAttemptList().toString());
        view.showRange(model.getRange());
    }

    /**
     * Ask next suggestion number from user
     *
     * @return data from user
     */
    public String askNextNumber(){
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.next();
        }catch (Exception e){
            return null;
        }
    }
}
