package cucumber.definitions;

import Framework.Abstracts.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LandingPageDeff extends Common {
    @Given("user goes to airline page")
    public void Landing() {
        System.out.println("User already navigated to home page via hooks");
    }
    @Then("validate airline logo is visible")
    public void Logo() {
        Assert.assertTrue(landPage().IsNavigationLogoDisplayed(), "Welcome Title Is Not Being Displayed");
    }
    @Given("A user selects direct flights option")
    public void SelectDirectFlights() {
        landPage().selectDirectFlights();
    }
    @And("User Clicks On One Way Button")
    public void ClickOneWayButton() {
        landPage().clickOneWayBtn();
    }

    @Then("Return Field Disappears From Users View")
    public void ReturnFieldDisplay() {
        Assert.assertFalse(landPage().IsReturnFieldDisplayed(), "Return Field Is Being Displayed After Selecting One Way Trip");
    }
}