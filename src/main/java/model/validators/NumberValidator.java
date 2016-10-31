package model.validators;

import model.entity.Error;

/**
 * Created by click on 10/30/2016.
 */
public class NumberValidator {
    public static final String INVALID_DATA = "Invalid data";
    public static final String NUMBER_OUT_OF_RANGE = "Number out of range";

    public static void dataValidate(String input, int x, int y, Error error){
        isIntNumber(input, error);
        if(!error.hasError()){
            numberInRangeValidate(Integer.parseInt(input), x, y, error);
        }
    }

    public static void numberInRangeValidate(int number, int x, int y, Error error){
        if(number < x || number > y){
            error.setHasError(true);
            error.setMessage(NUMBER_OUT_OF_RANGE);
        }
    }

    public static void isIntNumber(String input, Error error){
        try{
            int number = Integer.parseInt(input);
        }catch (NumberFormatException e){
            error.setMessage(INVALID_DATA);
            error.setHasError(true);
        }
    }
}
