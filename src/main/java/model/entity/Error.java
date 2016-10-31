package model.entity;

/**
 * Class which save error message and result validation of something
 *
 * @author Anastasia Milinchuk
 * @since 10/30/2016.
 */
public class Error {
    /**
     * Error message
     */
    private String message;

    /**
     * Result of validation
     */
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
