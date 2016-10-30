package model.entity;

/**
 * Created by click on 10/30/2016.
 */
public class Error {
    private String message;
    private boolean hasError;

    public Error() {
        hasError = false;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean hasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }
}
