package testingRecap;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class Calculator {

    private static final Logger LOGGER = Logger.getLogger(Calculator.class);

    public int add(int firstNumber, int secondNumber) {
        LOGGER.info("Adding two numbers " + firstNumber + " and " + secondNumber);
        return firstNumber + secondNumber;

    }

    public int addMultipleNumbers(int[] numbers) {
        LOGGER.info("Adding numbers" + Arrays.toString(numbers));
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public int subtractTwoNumbers(int firstNumber, int secondNumbers) {
        LOGGER.info("Subtracting two numbers " + firstNumber + " and " + secondNumbers);
        return firstNumber - secondNumbers;
    }

    public int subtractMultipleNumbers(int[] numbers) {
        LOGGER.info("Subtracting numbers" + Arrays.toString(numbers));
        int total = 0;
        for (int number : numbers) {
            total -= number;
        }
        return total;

    }
}