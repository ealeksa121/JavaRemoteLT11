package testingRecap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void testAddTwoNumbers() {

        int firstNumber = 12;
        int secondNumber = 3;

        int actualAddResult = calculator.add(firstNumber, secondNumber);

        assertEquals(15, actualAddResult);
        assertThat(actualAddResult).isEqualTo(15);


    }

    @Test
    void testAddMultipleNumbers() {

        int[] numbersToTest = {5, 2, -6, 8, 1};

        int actualResult = calculator.addMultipleNumbers(numbersToTest);

        assertEquals(10, actualResult);
        assertThat(actualResult).isEqualTo(10);


    }

    @Test
    void tesSubstractingTwoNumbers() {

        int firstNumber = 5;
        int secondNumber = 3;

        int actualResult = calculator.subtractTwoNumbers(firstNumber, secondNumber);

        assertThat(actualResult).isEqualTo(2);

    }

    @Test
    void testSubtractMultipleNumbers() {

        int[] numbersToTest = {5, 2, 6, 8, 1};

        int actualResult = calculator.subtractMultipleNumbers(numbersToTest);

        assertThat(actualResult).isEqualTo(-22);


    }
}