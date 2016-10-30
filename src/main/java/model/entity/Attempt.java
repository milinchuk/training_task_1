package model.entity;

import model.utils.Util;

/**
 * Created by click on 10/30/2016.
 */
public class Attempt {
    private int number;
    private String message;

    public Attempt() {
    }

    public Attempt(int value, String message) {
        this.number = value;
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
