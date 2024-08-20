import org.junit.Assert;
import org.junit.Test;
import org.example.Utilities;

public class UtilitiesTest {

    @Test
    public void testTrialingZeros() {

        // Arrange
        int input = 13;
        int actual = 0;
        int expected = 1300000;

        // Act
        actual = Utilities.addTrailingZeros(input);

        // Assert
        Assert.assertEquals(actual, expected);

    }


}
