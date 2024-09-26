import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StepDefSubtract {

    ArrayList<Integer> subtractedNumbers=new ArrayList<>();
    int resultSub=0;

    @Given("I also have the number {int}")
    public void iAlsoHaveTheNumber(int arg1) {

        subtractedNumbers.add(arg1);
    }


    @When("I press subtract")
    public void iPressSubtract() {
        CalculatorControl control= new CalculatorControl();

        resultSub= control.subtractNumbers(subtractedNumbers);

    }

    @Then("I also want to see the result {int} in my display")
    public void iAlsoWantToSeeTheResultInMyDisplay(int arg1) {
        assertEquals(arg1, resultSub);
    }
}
