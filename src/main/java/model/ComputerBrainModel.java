package model;

import model.entity.Attempt;
import model.entity.Result;
import model.utils.Util;

import java.util.Random;

/**
 * Created by click on 10/30/2016.
 */
public class ComputerBrainModel {
    private int secretNumber;
    private int x;
    private int y;

    public ComputerBrainModel(int x, int y) {
        this.x = x;
        this.y = y;
        Random random = new Random();
        secretNumber = random.nextInt(y - x) + x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int check(int number, Result result){
        int answer = Integer.compare(number, secretNumber);

        Attempt attempt = new Attempt(number);
        switch (answer){
            case -1:
                attempt.setMessage(Result.MORE);
                break;
            case 0:
                attempt.setMessage(Result.EQUAL);
                result.setIsCorrect(true);
                break;
            case 1:
                attempt.setMessage(Result.LESS);
                break;
        }
        result.setAttempt(attempt);
        result.addPreviousAttempt(result.getAttempt());
        return answer;
    }

    public String getRange(){
        return Util.rangeToString(x, y);
    }
}
