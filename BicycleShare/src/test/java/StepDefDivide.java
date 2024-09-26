import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StepDefDivide {

    ArrayList<Double> numbersToBeDivided= new ArrayList<>();

    double result=0;

    @Given("I have the number {int} to divide")
    public void iHaveTheNumberToDivide(double arg0) {
        numbersToBeDivided.add(arg0);
    }

    @When("I press divide")
    public void iPressDivide() {
        CalculatorControl control= new CalculatorControl();
        result= control.divideNumbers(numbersToBeDivided);
    }

    @Then("I want to see the divided result {int} on my display")
    public void iWantToSeeTheDividedResultOnMyDisplay(double arg0) {
        assertEquals(result, arg0);
    }
}
