import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StepDefMultiply {
    ArrayList<Integer> numbersToBeMultiply= new ArrayList<>();

    int result=0;

    @Given("I have the number {int} to multiply")
    public void iHaveTheNumberToMultiply(int arg0) {
        numbersToBeMultiply.add(arg0);
    }

    @When("I press multiply")
    public void iPressMultiply() {
        CalculatorControl control= new CalculatorControl();
        result= control.multiplyNumbers(numbersToBeMultiply);
    }

    @Then("I want to see the multiply result {int} on my display")
    public void iWantToSeeTheMultiplyResultOnMyDisplay(int arg0) {
        assertEquals(result, arg0);
    }
}
