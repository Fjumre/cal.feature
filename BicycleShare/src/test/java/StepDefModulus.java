import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StepDefModulus {


    ArrayList<Integer> modulusNumber= new ArrayList<>();

    int result=0;

    @Given("I have the number {int} to find the modulus of")
    public void iHaveTheNumberToFindTheModulusOf(int arg0) {
        modulusNumber.add(arg0);
    }

    @When("I press the modulus")
    public void iPressTheModulus() {
        CalculatorControl control= new CalculatorControl();
        result= control.modulus(modulusNumber);
    }


    @Then("I want to see the remnants {int} of the numbers on my display")
    public void iWantToSeeTheRemnantsOfTheNumbersOnMyDisplay(int arg0) {
        assertEquals(result, arg0);
    }
}
