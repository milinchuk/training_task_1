import model.entity.Error;
import model.validators.NumberValidator;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Class for testing input data
 *
 * @author Anastasia Milinchuk
 * @since 10/31/2016
 */
public class NumberValidatorTest {
    /**
     * Start range for generate secret number
     */
    private int xRange;

    /**
     * End of range for generation secret number
     */
    private int yRange;

    /**
     * Right input number by user is string
     */
    private String rightInput;

    /**
     * Wrong input number by user is string
     */
    private String wrongInput;

    /**
     * Set up attributes
     */
    @Before
    public void setUp(){
        xRange = 0;
        yRange = 10;
        rightInput = "10";
        wrongInput = "qwe";
    }

    /**
     * Check rightness of input number: is number in range
     */
    @Test
    public void testNumberIsInRange(){
        Error error = new Error();
        NumberValidator.numberInRangeValidate(yRange + 1, xRange, yRange, error);
        assertTrue(error.hasError());

        NumberValidator.numberInRangeValidate(xRange - 1, xRange, yRange, error);
        assertTrue(error.hasError());

        NumberValidator.numberInRangeValidate(xRange + 1, xRange, yRange, error);
        assertTrue(!error.hasError());
    }

    /**
     * Check is input value is number
     */
    @Test
    public void testIsIntNumber(){
        Error error = new Error();
        NumberValidator.isIntNumber(rightInput, error);
        assertEquals(error.hasError(), false);

        NumberValidator.isIntNumber(wrongInput, error);
        assertEquals(error.hasError(), true);
    }
}
