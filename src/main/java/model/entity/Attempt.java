package model.entity;

import model.utils.Util;

/**
 * Current attempt of user
 *
 * @author Anastasia Milinchuk
 * @since 10/30/2016.
 */
public class Attempt {
    /**
     * Current number which user enter
     */
    private int number;

    /**
     * Message about rightness of input number
     */
    private String message;

    public Attempt() {
    }

    /**
     * Initialization of attempt
     *
     * @param number is current number which user enter
     * @param message about rightness of input number
     */
    public Attempt(int number, String message) {
        this.number = number;
        this.message = message;
    }

    public Attempt(int number) {
        this.number = number;
    }

    public Attempt(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString(){
        return Util.concat(number, message);
    }
}
