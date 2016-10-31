package model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Result is answer from {@link model.ComputerBrainModel} to asking about secret number.
 * Containing current attempt, history and list of answers.
 *
 * @author Anastasia Milinchuk
 * @since 10/30/2016
 */
public class Result {
    /**
     * Answer when current number more than secret
     */
    public static final String MORE = "More";

    /**
     * Answer when current number equal to secret
     */
    public static final String EQUAL = "Equal";

    /**
     * Answer when current number less than secret
     */
    public static final String LESS = "Less";

    /**
     * Current user attempt
     */
    private Attempt attempt;

    /**
     * Result of correctness current attempt
     */
    private boolean isCorrect;

    /**
     * History of all attempts
     */
    private List<Attempt> attemptList;

    /**
     * Initialize of {@link Result}
     */
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
