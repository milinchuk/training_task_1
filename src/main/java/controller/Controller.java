package controller;

import model.ComputerBrainModel;
import model.entity.Error;
import model.entity.Result;
import model.validators.NumberValidator;
import view.View;
import model.entity.*;

import java.util.Scanner;

/**
 * Created by click on 10/30/2016.
 */
public class Controller {
    private ComputerBrainModel model;
    private View view;

    public Controller(ComputerBrainModel model, View view) {
        this.model = model;
        this.view = view;
    }

    public void start(){
        view.showStart();
        view.showRange(model.getRange());
        play();
    }

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
                nextStep(number, result);
            }
        } while(!result.isCorrect());

        view.showWin();
        view.showAttempts(result.getAttemptList().toString());
    }

    private void nextStep(int number, Result result){
        model.check(number, result);
        view.showResult(result.getAttempt().getMessage());
        view.showAttempts(result.getAttemptList().toString());
        view.showRange(model.getRange());
    }

    public String askNextNumber(){
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.next();
        }catch (Exception e){
            return null;
        }
    }
}
