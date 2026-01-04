package de.htwsaar.programmierung3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleCalculatorTest {

    @Test
    @DisplayName("Die Multiplikation von 2 und 5 sollte 10 ergeben")
    void multiplyTwoWithFiveShouldReturnTen() {

        var cal = new SimpleCalculator();
        int number1 = 2;
        int number2 = 5;

        int resultOfMultiplication = cal.multiply(number1, number2);

        assertEquals(10, resultOfMultiplication);
    }


    @Test
    @DisplayName("Die Addition von 3 und 2 sollte 5 ergeben")
    void add_ThreePlusTwoShouldReturnFive() {

        var cal = new SimpleCalculator();
        int number1 = 3;
        int number2 = 2;

        int resultOfAddition = cal.add(number1, number2);

        assertEquals(5,resultOfAddition);

    }

    @Test
    @DisplayName("Subtraktion von 5 und 3 soll 2 ergeben")
    void subtract_fiveMinusThreeShouldReturnTwo() {

        var cal = new SimpleCalculator();
        int number1 = 5;
        int number2 = 3;

        int resultOfSubtraction = cal.subtract(number1, number2);

        assertEquals(2,resultOfSubtraction);
    }

    @Test
    @DisplayName("Division von 6 und 3 soll 2 ergeben")
    void divide_sixDivideByThreeShouldReturnTwo() {

        var cal = new SimpleCalculator();
        int number1 = 6;
        int number2 = 3;

        int resultOfDivsion = cal.divide(number1, number2);

        assertEquals(2,resultOfDivsion);
    }

    @Test
    @DisplayName("Methode soll IllegalArgumentException werfen wenn Divisor 0 ist")
    void divide_divisonByZeroShouldThrowIllegalArgumentException() {

        var cal = new SimpleCalculator();
        int number1 = 6;
        int number2 = 0;

        assertThrows(IllegalArgumentException.class , () -> {
            cal.divide(number1, number2);
        });
    }

    @Test
    @DisplayName("Methode soll Wurzel 16 berechnen. Das Ergebnis sollte 4 sein")
    void squareRoot_squareRootOfsixteenShouldEqualFour() {

        var cal = new SimpleCalculator();
        double number = 16.0;

        double resultOfSquareRoot = cal.squareRoot(number);
        assertEquals(4.0,resultOfSquareRoot);
    }
}
