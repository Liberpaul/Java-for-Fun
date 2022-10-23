import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    //          Positive testing Happy Pass
    // 1. (start < end) return arrResult
    @Test
    public void testStartLessThanEnd_HappyPath() {
        //AAA
        //arrange
        int start = 1;
        int end = 15;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz","7", "8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //asserts
        Assert.assertEquals(expectedResult, actualResult);
    }

    // 2. (start = end)
    @Test
    public void testStartEqualEnd_HappyPath() {
        //AAA
        //arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //asserts
        Assert.assertEquals(expectedResult, actualResult);
    }

    //          Negative testing
    // 3. (start > end) return String[0]
//    @Ignore
    @Test
    public void testStartGreaterThanEnd_Negative() {
        //AAA
        //arrange
        int start = 2;
        int end = 1;
        String[] expectedResult = new String[0];

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //asserts
        Assert.assertEquals(expectedResult, actualResult);
    }



    // Positive testing: start=-20, end=-1;
}
