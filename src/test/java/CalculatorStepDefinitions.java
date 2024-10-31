import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorStepDefinitions {
    private Calculator calculator;

    @Given("a calculator I just turned on")
    public void a_calculator_i_just_turned_on() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        calculator.push(int1);
        calculator.push(int2);
        calculator.push("+");
    }

    @Then("the result is {double}")
    public void the_result_is(double expected) {
        Number value = calculator.value();
        assertEquals(expected, value);
    }

    @When("I subtract {int} from {int}")
    public void i_subtract_from(Integer int1, Integer int2) {
        calculator.push(int1);
        calculator.push(int2);
        calculator.push("-");
    }
}
