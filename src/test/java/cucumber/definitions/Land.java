package cucumber.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Land {
    @Given("user goes to page")
    public void Landing() {
        System.out.println("User's here!");
    }
    @Then("validate logo is visible")
    public void Logo() {
        System.out.println("Check Logo");
    }
}