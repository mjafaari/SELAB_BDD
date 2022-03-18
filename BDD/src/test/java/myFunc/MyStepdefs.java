package myFunc;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private MyFunc myFunc;
    private int value1;
    private int value2;
    private int result;

    @Before
    public void before() {
        myFunc = new MyFunc();
    }

    @Given("^Two input values, ([-]*\\d+) and ([-]*\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I divide and root them$")
    public void iDivideAndRootThem() {
        result = myFunc.divideAndRoot(value1, value2);
    }

    @Then("^I expect the result ([-]*\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}