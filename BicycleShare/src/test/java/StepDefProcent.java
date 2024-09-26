import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StepDefProcent {

    ArrayList<Double> procentNumbers= new ArrayList<>();

    double result=0;

    @Given("I have the number {int} to find the procent")
    public void iHaveTheNumberToFindTheProcent(double arg0) {
        procentNumbers.add(arg0);
    }

    @When("I type in the formula for finding the procentages")
    public void iTypeInTheFormulaForFindingTheProcentages() {
        CalculatorControl control= new CalculatorControl();
        result= control.procentages(procentNumbers);
    }




    @Then("I want to see the procent result {int} on my display")
    public void iWantToSeeTheProcentResultOnMyDisplay(double arg0) {
        assertEquals(result, arg0, 0.0001);
    }
}
