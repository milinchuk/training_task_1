package model.utils;

/**
 * Util class for changing data
 *
 * @author Anastasia Milinchuk
 * @since 10/30/2016
 */
public class Util {

    /**
     * Convert number to interval in string
     * @param x is start of interval
     * @param y is end of interval
     * @return interval in text format
     */
    public static String rangeToString(int x, int y){
        return "[" + x + ", " + y + "]";
    }

    /**
     * Concatenation number and text in usable format
     * @param number is number
     * @param string is text
     * @return usable format of number and string
     */
    public static String concat(int number, String string){
        return number + " " + string;
    }
}
