import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionalUnitTests {
    @Test
    public void add_int_1_and_int_2_returns_3() {
        // arrange
        int a = 1, b = 2;
        Number expectedAnswer = 3.0;
        Calculator calculator = new Calculator();

        // act
        calculator.push(a);
        calculator.push(b);
        calculator.push("+");
        Number actualAnswer = calculator.value();

        // assert
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void add_int_2_and_int_2_returns_4() {
        // arrange
        int a = 2, b = 2;
        Number expectedAnswer = 4.0;
        Calculator calculator = new Calculator();

        // act
        calculator.push(a);
        calculator.push(b);
        calculator.push("+");
        Number actualAnswer = calculator.value();

        // assert
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void add_operator_results_in_addition() {
        // arrange
        int a = 2, b = 4;
        Number expectedAnswer = 6.0;
        Calculator calculator = new Calculator();

        // act
        calculator.push(a);
        calculator.push(b);
        calculator.push("+");
        Number actualAnswer = calculator.value();

        // assert
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void unknown_operator_results_in_addition() {
        // arrange
        int a = 2, b = 4;
        Number expectedAnswer = 6.0;
        Calculator calculator = new Calculator();

        // act
        calculator.push(a);
        calculator.push(b);
        calculator.push("?");
        Number actualAnswer = calculator.value();

        // assert
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Disabled
    @Test
    public void subtract_operator_results_in_addition() {
        // arrange
        int a = 10, b = 30;
        Number expectedAnswer = 40.0;
        Calculator calculator = new Calculator();

        // act
        calculator.push(a);
        calculator.push(b);
        calculator.push("-");
        Number actualAnswer = calculator.value();

        // assert
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void subtract_operator_results_in_subtraction() {
        // arrange
        int a = 6, b = 10;
        Number expectedAnswer = 4.0;
        Calculator calculator = new Calculator();

        // act
        calculator.push(a);
        calculator.push(b);
        calculator.push("-");
        Number actualAnswer = calculator.value();

        // assert
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void multiply_operator_results_in_multiplication() {
        // arrange
        int a = 5, b = 5;
        Number expectedAnswer = 25.0;
        Calculator calculator = new Calculator();

        // act
        calculator.push(a);
        calculator.push(b);
        calculator.push("*");
        Number actualAnswer = calculator.value();

        // assert
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void divide_operator_results_in_division() {
        // arrange
        int a = 20, b = 5;
        Number expectedAnswer = 4.0;
        Calculator calculator = new Calculator();

        // act
        calculator.push(a);
        calculator.push(b);
        calculator.push("/");
        Number actualAnswer = calculator.value();

        // assert
        assertEquals(expectedAnswer, actualAnswer);
    }
}
