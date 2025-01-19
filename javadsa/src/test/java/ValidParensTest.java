import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.digiteched.javadsa.applications.ValidParens;

public class ValidParensTest {
    @Test
    public void itShouldReturnTrueForValidExample() {
        String validInput = "{[]}()";

        boolean result = new ValidParens().isValid(validInput);

        assertTrue(result);
    }

    @Test
    public void itShouldReturnFalseForInvalidExample() {
        String invalidInput = "{({}][";

        boolean result = new ValidParens().isValid(invalidInput);

        assertFalse(result);
    }

    @Test
    public void itShouldReturnTrueForEmptyString() {
        boolean result = new ValidParens().isValid("");

        assertTrue(result);
    }
}
