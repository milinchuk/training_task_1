import model.entity.Error;
import model.validators.NumberValidator;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by click on 10/31/2016.
 */
public class NumberValidatorTest {
    private int xRange;
    private int yRange;
    private String rightInput;
    private String wrongInput;

    @Before
    public void setUp(){
        xRange = 0;
        yRange = 10;
        rightInput = "10";
        wrongInput = "qwe";
    }

    @Test
    public void testNumberIsInRangeNumber(){
        Error error = new Error();
        NumberValidator.numberInRangeValidate(yRange + 1, xRange, yRange, error);
        assertTrue(error.hasError());

        NumberValidator.numberInRangeValidate(xRange - 1, xRange, yRange, error);
        assertTrue(error.hasError());

        NumberValidator.numberInRangeValidate(xRange + 1, xRange, yRange, error);
        assertTrue(!error.hasError());
    }

    @Test
    public void testIsIntNumber(){
        Error error = new Error();
        NumberValidator.isIntNumber(rightInput, error);
        assertEquals(error.hasError(), false);

        NumberValidator.isIntNumber(wrongInput, error);
        assertEquals(error.hasError(), true);
    }
}
