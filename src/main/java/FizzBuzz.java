import java.util.Arrays;

public class FizzBuzz {

    public String[] fizzBuzz(int start, int end) {
        if (start > end) {
            return new String[0];
        }

        String[] arrResult = new String[end - start + 1];

        for (int i = 0; i < arrResult.length && start <= end; i++) {
            if ((start % 15 == 0)) {
                arrResult[i] = "FizzBuzz";
            } else if (start % 3 == 0) {
                arrResult[i] = "Fizz";
            } else if (start % 5 == 0) {
                arrResult[i] = "Buzz";
            } else {
                arrResult[i] = String.valueOf(start);
            }
            start++;
        }
        return arrResult;
    }
}