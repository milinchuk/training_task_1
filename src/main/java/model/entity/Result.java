package model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by click on 10/30/2016.
 */
public class Result {
    public static final String MORE = "More";
    public static final String EQUAL = "Equal";
    public static final String LESS = "Less";

    private Attempt attempt;
    private boolean isCorrect;
    private List<Attempt> attemptList;

    public Result() {
        attemptList = new ArrayList<Attempt>();
        isCorrect = false;
        attempt = new Attempt();
    }

    public List<Attempt> getAttemptList() {
        return attemptList;
    }

    public void addPreviousAttempt(Attempt attempt){
        attemptList.add(attempt);
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public Attempt getAttempt() {
        return attempt;
    }

    public void setAttempt(Attempt attempt) {
        this.attempt = attempt;
    }
}
